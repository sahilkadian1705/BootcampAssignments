package com.sahilkadian.restful;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO{

    private List<User> userList=new ArrayList<>();

//    Add User
    public void addUser(UserTo user){
        userList.add(new User(user.getId(),user.getName(), user.getDesignation(), user.getPassword()));
    }
//    Get All Users
    public List<User> getUserList(){
        return userList;
    }
//    Get User By ID
    public User getUserById(int id) {
        for(User user:userList){
            if(user.getId()==id)
                return user;
        }
        return null;
    }
}
