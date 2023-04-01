package Question2;

public interface Shape {
    public void properties();
}
class Square implements Shape {
    @Override
    public void properties() {
        System.out.println("Square");
    }
}
class Circle implements Shape {
    @Override
    public void properties() {
        System.out.println("Circle");
    }
}
