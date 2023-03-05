package Question4;

public class Main {
    public static void main(String[] args){
        try{
            throw new MyException("Custom Exception Created");
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
