package Question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Main.class, args);
        ShapeSelection ss = context.getBean(ShapeSelection.class);
        ss.getProperties();
    }
}

@Component
class ShapeSelection {
    @Autowired
    Shape shape;

    void getProperties(){
        shape.properties();
    }
}
