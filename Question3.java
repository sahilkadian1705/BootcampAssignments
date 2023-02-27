import java.util.Scanner;
public class Question3 {
    public static void area(int r){
        int area=(22*r*r)/7;
        System.out.println(area);
    }
    public static void circumference(int r){
        int ans=(2*22*r)/7;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int input;
        int radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Calculate Area of a Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit");
        input=sc.nextInt();
        switch (input) {
            case 1 -> {
                System.out.print("Enter radius of circle to calculate area : ");
                radius = sc.nextInt();
                area(radius);
            }
            case 2 -> {
                System.out.print("Enter radius of circle to calculate circumference : ");
                radius = sc.nextInt();
                circumference(radius);
            }
            case 3 -> {
                System.out.println("Exiting");
                return;
            }
            default -> System.out.println("Wrong Input");
        }
    }
}