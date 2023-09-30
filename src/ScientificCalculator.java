import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Trigonometric Functions");
            System.out.println("7. Logarithms");
            System.out.println("8. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;

                case 2:
                    // Subtraction code here
                    break;

                case 3:
                    // Multiplication code here
                    break;

                case 4:
                    // Division code here
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    double number = scanner.nextDouble();
                    double squareRoot = Math.sqrt(number);
                    System.out.println("Square Root: " + squareRoot);
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    double trignumber = scanner.nextDouble();
                    System.out.println("Sin : "+ Math.sin(trignumber));
                    System.out.println("Cos : "+ Math.cos(trignumber));
                    System.out.println("Tan : "+ Math.tan(trignumber));
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    double logNumber = scanner.nextDouble();
                    double logarithm = Math.log10(logNumber);
                    System.out.println("Logarithm (base 10): " + logarithm);
                    break;

                case 8:
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
