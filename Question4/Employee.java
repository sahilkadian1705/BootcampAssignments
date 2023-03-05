package Question4;
import java.util.*;

public class Employee{
    String name;
    int age;
    String designation;

    public Employee(String name ,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee " +
                "Name = " + name +
                " , Age = " + age +
                " , Designation = " + designation;
    }
}