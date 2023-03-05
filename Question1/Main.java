package Question1;
import java.util.Scanner;
public class Main {
    enum House {
        FLAT("Flat", 100000),
        APARTMENT("Apartment", 500000),
        VILA("Vila", 200000),
        MANSION("Mansion", 3000000);

        private final String name;
        private final double price;

        House(String name, double price) {

            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose house type to know the cost");
        System.out.println("*******Options******");
        System.out.println("1.Flat");
        System.out.println("2.Apartment");
        System.out.println("3.Vila");
        System.out.println("4.Mansion");
        System.out.print("enter a house number : ");
        int user_input = sc.nextInt();

        switch (user_input) {
            case 1 -> {
                House flat = House.FLAT;
                System.out.println("Cost of "+flat.name+" is: Rs "+flat.getPrice());
            }
            case 2 -> {
                House apartment = House.APARTMENT;
                System.out.println("Cost of "+apartment.name+" is: Rs "+apartment.getPrice());
            }
            case 3 -> {
                House vila = House.VILA;
                System.out.println("Cost of "+vila.name+" is: Rs "+vila.getPrice());
            }
            case 4 -> {
                House mansion = House.MANSION;
                System.out.println("Cost of "+mansion.name+" is: Rs "+mansion.getPrice());
            }
        }


    }
}