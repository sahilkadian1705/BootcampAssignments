package Question6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(Main.class,args);
        Employee e=(Employee) context.getBean(Employee.class);
        System.out.println(e);
    }
}

@Component
class Employee{
    @Autowired
    Department department;

    public Employee(Department department) {
        System.out.println("Employee Constructor");
        this.department=department;

    }
}
