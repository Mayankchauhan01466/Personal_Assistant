package Assistant;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter command: ");
        String command = sc.nextLine().toLowerCase();

        if (command.contains("calculate")) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            sc.nextLine(); // buffer clear

            System.out.println("Assistant: Sum is " + (a + b));
        }
        else {
            System.out.println("Assistant: Command not recognized");
        }

        sc.close();
    }
}
