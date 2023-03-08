package Question5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args){
        Employee e1=new Employee("Sahil","","Kadian",2000L,"Delhi");
        Employee e2=new Employee("Shubham" ,"","Gupta",6000L,"Delhi");
        Employee e3=new Employee("Anoop","","Kumar", 1000L,"Delhi");
        Employee e4=new Employee("Rajat","", "Dash",7000L,"Delhi");
        Employee e5=new Employee("Aditya","", "Nagyal",5000L,"Delhi");
        Employee e6=new Employee("Amit","", "Koranga",3000L,"Delhi");
        Employee e7=new Employee("Sumit",""," Kumar",4000L,"Delhi");
        Employee e8=new Employee("Pranshu","","Sajula",1500L,"Delhi");
        Employee e9=new Employee("Nitin","","Yadav",8000L,"Delhi");
        Employee e10=new Employee("Shashank","","Daksh",9000L,"Delhi");

        List<Employee>ls= Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
        Set<String> set=new HashSet<>();
        ls.stream()
                .filter(e -> e.salary<5000L)
                .filter(e -> e.city=="Delhi")
                .forEach(e -> set.add(e.firstname));
        set.forEach(System.out::println);
    }
}