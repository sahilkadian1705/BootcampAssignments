package Question2;
interface Addition{
    void add(int a,int b);
}
interface Subtraction{
    void sub(int a,int b);
}
interface Multiplication{
    void mul(int a,int b);
}
public class Main {
    void Add(int a,int b){
        System.out.println(a+b);
    }
    void Sub(int a,int b){
        System.out.println(a-b);
    }
    static void Mul(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args){
        Addition a=new Main()::Add;
        a.add(3,4);
        Subtraction s=new Main()::Sub;
        s.sub(10,6);
        Multiplication m=Main::Mul;
        m.mul(3,4);
    }
}