package Question1;
interface Interface1 {
    boolean demo1(int a,int b);
}
interface Interface2 {
    int demo2(int a);
}
interface Interface3 {
    String demo3(String a,String b);
}
interface Interface4 {
    String demo4(String a);
}
public class Main {
    public static void main(String[] args){
        Interface1 it1= (a,b) -> a>b;
        Interface2 it2= a -> a+1;
        Interface3 it3= (a,b) -> a+b;
        Interface4 it4= a -> a.toUpperCase();
        System.out.println(it1.demo1(5,4));
        System.out.println(it2.demo2(3));
        System.out.println(it3.demo3("Hello","World"));
        System.out.println(it4.demo4("Hello"));
    }
}