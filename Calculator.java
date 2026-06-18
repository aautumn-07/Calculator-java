    import java.util.Scanner;

public class Calculator {

    // safe int input
    public static int getIntInput(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Invalid input. Enter a number.");
                sc.next();
            }
        }
    }

    // safe double input
    public static double getDoubleInput(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Invalid input. Enter a valid number.");
                sc.next();
            }
        }
    }

    // factorial method
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Square");
            System.out.println("7. Cube");
            System.out.println("8. Factorial");
            System.out.println("9. Exit");

            int choice = getIntInput(sc, "Enter your choice: ");

            if (choice == 9) {
                System.out.println("Calculator exited.");
                break;
            }

            double num1, num2;

            switch (choice) {

                case 1:
                    num1 = getDoubleInput(sc, "Enter first number: ");
                    num2 = getDoubleInput(sc, "Enter second number: ");
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2:
                    num1 = getDoubleInput(sc, "Enter first number: ");
                    num2 = getDoubleInput(sc, "Enter second number: ");
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case 3:
                    num1 = getDoubleInput(sc, "Enter first number: ");
                    num2 = getDoubleInput(sc, "Enter second number: ");
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case 4:
                    num1 = getDoubleInput(sc, "Enter first number: ");
                    num2 = getDoubleInput(sc, "Enter second number: ");
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;

                case 5:
                    num1 = getDoubleInput(sc, "Enter first number: ");
                    num2 = getDoubleInput(sc, "Enter second number: ");
                    System.out.println("Result: " + (num1 % num2));
                    break;

                case 6:
                    num1 = getDoubleInput(sc, "Enter number: ");
                    System.out.println("Square: " + (num1 * num1));
                    break;

                case 7:
                    num1 = getDoubleInput(sc, "Enter number: ");
                    System.out.println("Cube: " + (num1 * num1 * num1));
                    break;

                case 8:
                    int n = getIntInput(sc, "Enter number: ");

                    if (n < 0) {
                        System.out.println("Factorial not defined for negative numbers");
                    } else {
                        System.out.println("Factorial: " + factorial(n));
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 to 9.");
            }
        }

        sc.close();
    }
}