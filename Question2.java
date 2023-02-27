import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = "";
        while (true) {
            System.out.print("Enter text: ");
            String line = scanner.nextLine();
            if (line.equals("XDONE")) {
                break;
            }
            inputText += line + "\n";
        }
        System.out.println("Entered text:");
        System.out.println(inputText);
    }
}

