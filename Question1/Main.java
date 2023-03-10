package Question1;
interface Demo{
    default void show(){
        display();
    }
    private void display(){
        System.out.println("Private Display Function");
    }
}
public class Main implements Demo{
    public static void main(String[] args) {
        Demo demo = new Main();
        demo.show();
    }
}
