package Question4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("Sahil",21,"Trainee");
        Employee e2=new Employee("Harsh",21,"QE");
        Employee e3=new Employee("Shubham",23,"Devops");
        Employee e4=new Employee("Rajat",22,"Sde");

        Map<Employee,Integer> map=new HashMap<>();
        map.put(e1,15000);
        map.put(e2,250000);
        map.put(e3,75000);
        map.put(e4,100000);
        System.out.println(e1.equals(e3));
    }
}