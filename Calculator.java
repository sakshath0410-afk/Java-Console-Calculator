import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== JAVA CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + add(a, b));
                        break;

                    case 2:
                        System.out.println("Result = " + subtract(a, b));
                        break;

                    case 3:
                        System.out.println("Result = " + multiply(a, b));
                        break;

                    case 4:
                        System.out.println("Result = " + divide(a, b));
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Thank you for using the calculator.");
            } else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}