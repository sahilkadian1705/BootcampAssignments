package com.sahilkadian.JPAwithHibernatePart2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    
    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
        return employeeService.findAllEmployees();
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @GetMapping("/employees/salary")
    public List<Object> getEmployeesSalary(){
        return employeeService.findAllEmployeesWithSalaryGreaterThanAverage();
    }

    @GetMapping("/employees/updateSalary")
    public void updateSalary(@RequestParam int increment){
        employeeService.updateEmployeesSalary(increment);
    }

    @DeleteMapping("/employees/min")
    public void deleteEmployee(){
        employeeService.deleteEmployeeWithMinSalary();
    }

    @GetMapping("/employees/singh")
    public List<Object> getEmployeesWithSingh(){
        return employeeService.getEmployeesWithSingh();
    }

    @DeleteMapping("/employees")
    public void deleteEmployeesWithAgeGreater(@RequestParam int age){
        employeeService.deleteEmployeesByAge(age);
    }
}
