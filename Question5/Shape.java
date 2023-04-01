package Question5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public interface Shape {
    public void properties();
}

@Component
@Primary
class Circle implements Shape{
    @Override
    public void properties() {
        System.out.println("Circle");
    }
}

@Component
class Square implements Shape{
    @Override
    public void properties() {
        System.out.println("Square");
    }
}