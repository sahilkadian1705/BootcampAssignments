package Question3;

public class Main {
    public static void main(String[] args){
        try {
            Test test=new Test();
            test.run();
        } catch (NoClassDefFoundError e) {
            System.err.println("NoClassDefFoundError: " + e.getMessage());
        }

        try {
            Class.forName("Test1");
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}
