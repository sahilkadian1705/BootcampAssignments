package Question2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);
		ShapeSelection ss=new ShapeSelection(new Circle());
		ss.getProperties();
	}
}

class ShapeSelection {

	private final Shape shape;

	public ShapeSelection(Shape shape) {
		this.shape = shape;
	}

	void getProperties(){
		shape.properties();
	}
}