package Question11;
record Student(String name,int id,int age){
    static int counter=0;
    Student{
        counter++;
    }
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Sahil",1,22);
        Student s2=new Student("Kartik",2,23);
        System.out.println(Student.counter);
    }
}
