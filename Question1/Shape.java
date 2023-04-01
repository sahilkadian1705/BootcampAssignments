package Question1;

public interface Shape {
    public void properties();
}
class Circle implements Shape{
    @Override
    public void properties() {
        System.out.println("Circle");
    }
}
class Square implements Shape{
    @Override
    public void properties() {
        System.out.println("Square");
    }
}