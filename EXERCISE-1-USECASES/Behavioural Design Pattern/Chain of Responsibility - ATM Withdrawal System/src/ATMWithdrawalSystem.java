import java.util.Scanner;

/**
 * Main class to run the ATM withdrawal system.
 */
public class ATMWithdrawalSystem {

    public static void main(String[] args) {
        // Create handlers for each denomination
        Handler fiveHundredHandler = new FiveHundredRupeeHandler();
        Handler twoHundredHandler = new TwoHundredRupeeHandler();
        Handler oneHundredHandler = new OneHundredRupeeHandler();
        Handler fiftyHandler = new FiftyRupeeHandler();

        // Set up the chain of responsibility
        fiveHundredHandler.setNextHandler(twoHundredHandler);
        twoHundredHandler.setNextHandler(oneHundredHandler);
        oneHundredHandler.setNextHandler(fiftyHandler);

        // Get user input for the amount to withdraw
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        scanner.close(); // Close the scanner to avoid resource leak

        // Create a request with the user-provided amount
        Request request = new Request(amount);

        // Start processing the request through the chain
        fiveHundredHandler.processRequest(request);
    }
}
