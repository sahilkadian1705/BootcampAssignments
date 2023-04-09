package com.sahilkadian.JPAwithHibernatePart2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Object> findAllEmployeesWithSalaryGreaterThanAverage(){
        return employeeRepository.findAllEmployeesWithSalaryGreaterThanAverageSalary(Sort.by(Sort.Direction.ASC,"age").and(Sort.by(Sort.Direction.DESC,"salary")));
    }

    public void updateEmployeesSalary(int increment){
        Long avgSalary = employeeRepository.avgSalary();
        employeeRepository.updateEmployeesBySalary(increment,avgSalary);
    }

    public void deleteEmployeeWithMinSalary(){
        Long minSalary = employeeRepository.minSalary();
        employeeRepository.deleteEmployeeWithMinSalary(minSalary);
    }

    public List<Object> getEmployeesWithSingh(){
        return employeeRepository.getEmployeesWithSingh("Singh");
    }

    public void deleteEmployeesByAge(int age){
        employeeRepository.deleteEmployeesByAge(age);
    }
}
