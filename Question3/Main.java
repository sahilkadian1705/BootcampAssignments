package Question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Main{
    public static void main(String[] args) {
        ApplicationContext ac= SpringApplication.run(Main.class,args);
        Calculator calc1=ac.getBean(Calculator.class);
        Calculator calc2=ac.getBean(Calculator.class);
        System.out.println(calc1);
        System.out.println(calc2);
        calc1.showAnswer(4,2);
        calc2.showAnswer(9,2);
    }
}

@Component
class Calculator {

    @Autowired
    Operation op;

    public Calculator(Operation op) {
        this.op = op;
    }

    public void showAnswer(int a, int b){
        System.out.println(op.operate(a,b));
    }
}