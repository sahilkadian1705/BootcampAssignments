package com.sahilkadian.restful;

public class UserVersion1 {
    private int id;
    private String name;

    public UserVersion1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserVersion1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
