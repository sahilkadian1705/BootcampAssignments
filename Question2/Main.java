package Question2;
interface TestDefault {
    default void showDefault() {
        System.out.println("Default method show function");
    };
}
interface TestStatic{
    static void showStatic() {
        System.out.println("Static method show function");
    };
}
public class Main {
    public static void main(String[] args) {
        TestDefault t1=new TestDefault(){};
        t1.showDefault();
        TestStatic.showStatic();
    }
}
