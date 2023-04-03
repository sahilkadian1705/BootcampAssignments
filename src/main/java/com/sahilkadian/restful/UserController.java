package com.sahilkadian.restful;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
public class UserController {

    private MessageSource messageSource;

    public UserController(MessageSource messageSource){
        this.messageSource=messageSource;
    }

    @Autowired
    UserDAO userDAO;

//    Q.1 Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.
//    Q.2 Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)

    @GetMapping("/message")
    public String print(@RequestParam String username){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("hello.message",null,"Default Message",locale)+" "+username;
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        userDAO.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userDAO.getUserList();
    }

    @GetMapping("/users/{id}")
    public EntityModel<User> getUsers(@PathVariable int id){
        User user = userDAO.getUserById(id);
        EntityModel<User> entityModel=EntityModel.of(user);
        WebMvcLinkBuilder link=linkTo(methodOn(UserController.class).getAllUsers());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }

    @GetMapping("/users/filtering")
    public MappingJacksonValue filtering(){
        List<User> users = userDAO.getUserList();
        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(users);
        FilterProvider filters = new SimpleFilterProvider().addFilter("userFilter",SimpleBeanPropertyFilter.filterOutAllExcept("name"));
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
