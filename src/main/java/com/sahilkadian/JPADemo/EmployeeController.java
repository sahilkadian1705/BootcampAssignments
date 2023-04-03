package com.sahilkadian.JPADemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
//    READ
    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
        return employeeService.findAllEmployees();
    }
//    CREATE
    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
//    DELETE
    @DeleteMapping("/employees/{id}")
    public void deleteEmployeeById(@RequestParam int id){
        employeeService.deleteEmployeeById(id);
    }
//    DELETE BY ID
    @DeleteMapping("/employees")
    public void deleteEmployees(){
        employeeService.deleteEmployees();
    }
//    COUNT
    @GetMapping("/employees/count")
    public Long getEmployeesCount(){
        return employeeService.getEmployeesCount();
    }
//    SORTING
    @GetMapping("/employees/{field}")
    public List<Employee> findEmployeesBySorting(@PathVariable String field){
        return employeeService.getEmployeeWithSorting(field);
    }
//    PAGINATION
    @GetMapping("/employees/{offset}/{pageSize}")
    public Page<Employee> findEmployeesByPagination(@PathVariable int offset, @PathVariable int pageSize){
        return employeeService.getEmployeesWithPagination(offset, pageSize);
    }
//    PAGINATION AND SORTING
    @GetMapping("/employees/{field}/{offset}/{pageSize}")
    public Page<Employee> findEmployeesByPagination(@PathVariable int offset, @PathVariable int pageSize,@PathVariable String field){
        return employeeService.getEmployeesWithPaginationAndSorting(offset, pageSize,field);
    }
//    FIND EMPLOYEE BY NAME
    @GetMapping("/employees/user")
    public Employee getEmployeeByName(@RequestParam String name){
        return employeeService.getEmployeeByName(name);
    }
//    FIND EMPLOYEE STARTING WITH A
    @GetMapping("/employees/A")
    public List<Employee> getEmployeesStartingWithA(){
        return employeeService.getEmployeeStartingWithA();
    }
//    FIND EMPLOYEES BETWEEN AGE
    @GetMapping("/employees/ageBetween")
    public List<Employee> getEmployeesBetweenAge(){
        return employeeService.getEmployeeAgeBetween();
    }
}
