
import java.util.Scanner;

public class Input {

    public class InputExample {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Create Scanner object

            System.out.print("Enter your name: ");
            String name = scanner.nextLine(); // Reads a line of text

            System.out.print("Enter your college name: ");
            String college = scanner.nextLine(); // Reads a line of text

            System.out.print("Enter your age: ");
            int age = scanner.nextInt(); // Reads an integer

            System.out.print("Enter a boolean value (true/false): ");
            boolean flag = scanner.nextBoolean(); // Reads a boolean

            // Output the entered information
            System.out.println("\nYou entered the following details:");
            System.out.println("Name: " + name);
            System.out.println("College: " + college);
            System.out.println("Age: " + age);
            System.out.println("Boolean value: " + flag);

            scanner.close(); // Close the scanner
        }
    }

}
