package com.sahilkadian.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController implements CommandLineRunner {

    @Autowired
    EmployeeDao employeeDao;

    List<Employee> employeeList = new ArrayList<>();

    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
        employeeDao.findAll().forEach(employeeList::add);
        return employeeList;
    }

    @Override
    public void run(String... args) throws Exception {
        employeeDao.save(new Employee(1L,"Sahil","SDE"));
        employeeDao.save(new Employee(2L,"Nitin","SDE"));
        employeeDao.save(new Employee(3L,"Shubham","SDE"));
        employeeDao.save(new Employee(4L,"Rajat","SDE"));
    }
}
