import java.util.Scanner;

// This class implements a simple console-based calculator
public class Calculator {

    // Method to safely read an integer from the user
    public static int getIntInput(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // clear wrong input
            }
        }
    }

    // Method to safely read a double from the user
    public static double getDoubleInput(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // clear wrong input
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Loop until the user chooses to exit
        while (true) {

            // Display menu options
            System.out.println();
            System.out.println("Simple Calculator");
            System.out.println("1 Add");
            System.out.println("2 Subtract");
            System.out.println("3 Multiply");
            System.out.println("4 Divide");
            System.out.println("5 Exit");

            // Get user choice safely
            int choice = getIntInput(sc, "Enter your choice: ");

            // If user wants to exit
            if (choice == 5) {
                System.out.println("Calculator ended");
                sc.close();
                break;
            }

            // Get two numbers from the user
            double num1 = getDoubleInput(sc, "Enter first number: ");
            double num2 = getDoubleInput(sc, "Enter second number: ");

            // Perform calculation and display result with 2 decimal places
            if (choice == 1) {
                System.out.printf("Result: %.3f%n", (num1 + num2));
            } else if (choice == 2) {
                System.out.printf("Result: %.3f%n", (num1 - num2));
            } else if (choice == 3) {
                System.out.printf("Result: %.3f%n", (num1 * num2));
            } else if (choice == 4) {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("Result: %.3f%n", (num1 / num2));
                }
            } else {
                System.out.println("Invalid choice. Please select 1 to 5.");
            }
        }
    }
}