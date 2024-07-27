// Import necessary classes for using lists, maps, and scanner.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Define the ShoppingCart class to manage products in the cart.
public class ShoppingCart {
    // Declare a list to hold products added to the cart.
    private List<Product> cart = new ArrayList<>();

    // Method to add a product to the cart using a factory.
    public void addProduct(ProductFactory factory) {
        cart.add(factory.createProduct());
    }

    // Method to display the contents of the cart.
    public void displayCart() {
        System.out.println("Products in cart:");
        for (Product product : cart) {
            System.out.println(product.getName() + ": $" + product.getPrice());
        }
    }

    // Main method to run the application.
    public static void main(String[] args) {
        // Create an instance of ShoppingCart.
        ShoppingCart shoppingCart = new ShoppingCart();
        // Initialize a scanner to read user input.
        Scanner scanner = new Scanner(System.in);

        // Create a map to associate user input with product factories.
        Map<String, ProductFactory> factoryMap = new HashMap<>();
        // Map "apple" to AppleFactory.
        factoryMap.put("apple", new AppleFactory());
        // Map "banana" to BananaFactory.
        factoryMap.put("banana", new BananaFactory());

        // Prompt the user to enter a product type.
        System.out.println("Enter product type (apple/banana):");
        // Read the user input, trim whitespace, and convert to lowercase.
        String productType = scanner.nextLine().trim().toLowerCase();

        // Retrieve the appropriate factory from the map or use InvalidProductFactory if the type is not found.
        ProductFactory factory = factoryMap.getOrDefault(productType, new InvalidProductFactory());
        // Add the product created by the factory to the cart.
        shoppingCart.addProduct(factory);

        // Display the contents of the cart.
        shoppingCart.displayCart();
    }
}
