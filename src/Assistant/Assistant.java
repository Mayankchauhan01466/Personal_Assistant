package Assistant;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

    public class Assistant {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Hello! I am your personal assistant.");
            System.out.println("How can I help you?");

            while (true) {
                System.out.print("You: ");
                String command = sc.nextLine().toLowerCase();

                if (command.contains("hello")) {
                    System.out.println("Assistant: Hello! Nice to meet you 😊");

                } else if (command.contains("time")) {
                    System.out.println("Assistant: Current time is " + LocalTime.now());

                } else if (command.contains("date")) {
                    System.out.println("Assistant: Today's date is " + LocalDate.now());

                } else if (command.contains("exit")) {
                    System.out.println("Assistant: Goodbye! 👋");
                    break;

                } else {
                    System.out.println("Assistant: Sorry, I don't understand that.");
                }
            }
            sc.close();
        }
    }

