package com.sahilkadian.restful;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonFilter("userFilter")
//@JsonIgnoreProperties
public class User {

    private int id;
    private String name;
    private String designation;
    @JsonIgnore
    private String password;

    public User(int id, String name, String designation,String password) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPassword() {
        return password;
    }
}