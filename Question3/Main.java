package Question3;
interface A{
    default void show(){
        System.out.println("Interface A show method");
    }
}
interface B{
    default void show(){
        System.out.println("Interface B show method");
    }
}
interface C extends A,B{
    default void show(){
        System.out.println("Interface C show method");
    }
}
public class Main {
    public void show(){
        System.out.println("Main Class show method");
    }
    public static void main(String[] args){
        Main m=new Main();
        m.show();
    }
}
