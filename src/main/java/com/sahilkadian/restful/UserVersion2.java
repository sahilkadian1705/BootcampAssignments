package com.sahilkadian.restful;

public class UserVersion2 {
    private int id;
    private String firstName;
    private String lastName;
    private String designation;

    public UserVersion2(int id, String firstName, String lastName, String designation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "UserVersion2{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
