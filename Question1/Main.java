package Question1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
        ShapeSelection ss = new ShapeSelection();
        ss.getProperties();
    }
}

class ShapeSelection {

    Shape shape = new Square();

    void getProperties(){
        shape.properties();
    }
}
