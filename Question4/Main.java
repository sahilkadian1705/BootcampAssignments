package Question4;
interface GreetingInterface{
    void show(String s);
}
public class Main {
    Main(String s){
        System.out.println("Good Morning "+s);
    }
    public static void main(String[] args){
        GreetingInterface greetingInterface=Main::new;
        greetingInterface.show("Sahil");
    }
}
