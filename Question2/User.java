package Question2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String phoneNumber;
    public User(String firstname,String lastname,int age,String phoneNumber){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.phoneNumber=phoneNumber;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User Name :"+firstname+" "+lastname+" Age :"+age+" Phone Number :"+phoneNumber;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        try(FileWriter file=new FileWriter("src/Question2/user.txt",true)){
            while (true){
                System.out.print("Enter your Firstname: ");
                String fname=sc.next();
                System.out.print("Enter your Lastname: ");
                String lname=sc.next();
                System.out.print("Enter your Age: ");
                int age=sc.nextInt();
                System.out.print("Enter your Phone Number: ");
                String phnnum= sc.next();
                User user=new User(fname,lname,age,phnnum);
                file.write(user+"\n");
                System.out.print("Do you want to continue creating users? (Type QUIT to exit):(Press Enter to add more) ");
                String input = sc.next();
                if (input.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
