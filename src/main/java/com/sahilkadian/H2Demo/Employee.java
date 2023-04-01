package com.sahilkadian.H2Demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import java.util.Objects;

@Entity
@Table
public class Employee {

    @Id
    private Long id;

    @NotEmpty(message = "Name should not be empty")
    private String name;

    @Min(18)
    private int age;

    public Employee(Long id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        return emp.id.equals(this.id);
    }
}
