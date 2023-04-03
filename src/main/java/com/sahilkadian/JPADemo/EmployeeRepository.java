package com.sahilkadian.JPADemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByName(String name);
    List<Employee> findByNameStartsWith(String str);
    List<Employee> findByAgeBetween(int a,int b);
}