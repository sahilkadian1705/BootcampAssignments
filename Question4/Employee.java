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
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null || getClass()!=o.getClass()) return  false;
        Employee emp=(Employee) o;
        if(age!=emp.age)return false;
        if(name!=null ? !name.equals(emp.name):emp.name!=null)return false;
        if(age!=0 ? age!=(emp.age):emp.age!=0)return false;
        return designation!=null ?designation.equals(emp.designation):emp.designation==null;
    }
}