// Define a class named InvalidProduct that implements the Product interface.
public class InvalidProduct implements Product {
    // Override the getName method to return "Invalid Product".
    @Override
    public String getName() {
        return "Invalid Product";
    }

    // Override the getPrice method to return a price of 0.0, indicating an invalid product.
    @Override
    public double getPrice() {
        return 0.0;
    }
}
