import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the original price
        System.out.print("Enter the original price: ");
        double price = scanner.nextDouble();

        // Create a BasicPriceCalculator object
        PriceCalculator calculator = new BasicPriceCalculator();

        // Prompt user to enter the discount percentage
        System.out.print("Enter the discount percentage (e.g., 0.10 for 10%): ");
        double discount = scanner.nextDouble();

        // Apply the DiscountDecorator with the user-provided discount
        calculator = new DiscountDecorator(calculator, discount);

        // Calculate the final price after applying the discount
        double finalPrice = calculator.calculatePrice(price);

        // Display the final price to the user
        System.out.println("The final price after discount is: " + finalPrice);

        // Close the scanner
        scanner.close();
    }
}
