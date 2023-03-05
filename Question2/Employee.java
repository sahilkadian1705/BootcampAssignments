package Question2;
import java.util.*;
public class Employee implements Comparable<Employee>{
    public double age;
    public double salary;
    public String name;

    public int compareTo(Employee o){
        return (this.name).compareTo((o.name));
    }

    Employee(double age,double salary,String name){
        this.age=age;
        this.salary=salary;
        this.name=name;
    }

    static class salarycomparator implements Comparator<Employee>{
        public int compare(Employee e1,Employee e2){
            if(e1.salary>e2.salary)return 1;
            else if(e1.salary<e2.salary) return -1;
            else return 0;
        }
    }

    public static void main(String[] args){
        ArrayList<Employee> al=new ArrayList<>();
        Employee e1=new Employee(10.0,8000.0,"Yogesh");
        Employee e2=new Employee(15.0,6000.0,"Shubham");
        Employee e3=new Employee(22.0,1000.0,"Rajat");
        Employee e4=new Employee(18.0,3000.0,"Amit");
        Employee e5=new Employee(12.0,2000.0,"Sahil");
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        Collections.sort(al,new salarycomparator());

        for(Employee e:al){
            System.out.println(e.name);
        }
    }
}
