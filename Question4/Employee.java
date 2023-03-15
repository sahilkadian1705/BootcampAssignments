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

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Employee " +
                "Name = " + name +
                " , Age = " + age +
                " , Designation = " + designation;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, designation, age);
    }
    @Override
    public boolean equals(Object obj){
        Employee emp = (Employee) obj;
        return emp.name.equals(this.name) && emp.age == this.age && emp.designation.equals(this.designation);
    }
}