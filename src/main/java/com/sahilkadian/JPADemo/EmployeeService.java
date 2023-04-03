package com.sahilkadian.JPADemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployees(){
        employeeRepository.deleteAll();
    }

    public void deleteEmployeeById(int id){
        employeeRepository.deleteById(id);
    }

    public Long getEmployeesCount(){
        return employeeRepository.count();
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeeWithSorting(String field){
        return employeeRepository.findAll(Sort.by(Sort.Direction.ASC,field));
    }

    public Page<Employee> getEmployeesWithPagination(int offset,int pageSize){
        return employeeRepository.findAll(PageRequest.of(offset,pageSize));
    }

    public Page<Employee> getEmployeesWithPaginationAndSorting(int offset,int pageSize,String field){
        return employeeRepository.findAll(PageRequest.of(offset,pageSize).withSort(Sort.by(field)));
    }

    public Employee getEmployeeByName(String name){
        return employeeRepository.findByName(name);
    }

    public List<Employee> getEmployeeStartingWithA(){
        return employeeRepository.findByNameStartsWith("S");
    }

    public List<Employee> getEmployeeAgeBetween(){
        return employeeRepository.findByAgeBetween(28,32);
    }
}
