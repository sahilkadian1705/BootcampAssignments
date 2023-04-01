package com.sahilkadian.H2Demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EmployeeDao{
    private List<Employee> employees=new ArrayList<>();

//    save
    public void getEmployee(Employee employee){
        employees.add(employee);
    }

//    findById
    public Employee findEmployeeById(Long id){
        for(Employee e:employees){
            if(e.getId()==id)
                return e;
        }
        return null;
    }

//    findAll
    public List<Employee> getAllEmployees(){
        return employees;
    }

//    deleteById
    public void deleteById(Long id){
        List<Employee> list=new ArrayList<>();
        for(Employee e:employees){
            if(e.getId()==id)
                list.add(e);
        }
        employees.removeAll(list);
    }

//    deleteAll
    public void deleteAllEmployees(){
        employees.removeAll(employees);
    }

//    put
    public void updateEmployee(Employee employee){
        int index;
        for(Employee e:employees){
            if(employee.getId().equals(e.getId())){
                index=employees.indexOf(e);
                employees.set(index,employee);
                break;
            }
        }
    }
}
