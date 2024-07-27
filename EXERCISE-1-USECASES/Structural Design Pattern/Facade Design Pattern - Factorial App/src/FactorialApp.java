
// This is the main class that interacts with the user and uses the MathOperationsFacade
// to perform the factorial calculation.
import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        // Create an instance of the facade
        MathOperationsFacade facade = new MathOperationsFacade();
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter number to calculate factorial: ");
        double number = scanner.nextDouble();

        // Calculate factorial using the facade
        double result = facade.calculateFactorial(number);

        // Display the result
        System.out.println("Factorial: " + result);

        // Close the scanner
        scanner.close();
    }
}
