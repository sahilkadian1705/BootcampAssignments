package Question5;

public class Employee {
    String fullname,firstname,middlename,lastname;
    Long salary;
    String city;
    public Employee(String firstname,String middlename,String lastname,Long salary,String city){
        this.firstname=firstname;
        this.middlename=middlename;
        this.lastname=lastname;
        this.salary=salary;
        this.city=city;
        fullname=firstname+" "+middlename+" "+lastname;
    }

    public String getFirstname() {
        return firstname;
    }
}
