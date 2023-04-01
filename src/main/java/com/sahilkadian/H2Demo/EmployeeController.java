package com.sahilkadian.H2Demo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return employeeDao.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id) throws EmployeeNotFoundException {
        Employee e=employeeDao.findEmployeeById(id);
        if(e==null)
            throw new EmployeeNotFoundException("id"+id);
        return e;
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee){
        employeeDao.getEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeDao.deleteById(id);
    }

    @DeleteMapping("/employee")
    public void deleteEmployee(){
        employeeDao.deleteAllEmployees();
    }

    @PutMapping("/employee/{id}/{name}")
    public void updateEmployee(@PathVariable int empId,@PathVariable String empName, @RequestBody Employee employee){
        employeeDao.updateEmployee(employee);
    }
}
