// Define a class named Apple that implements the Product interface.
public class Apple implements Product {
    // Override the getName method to return "Apple".
    @Override
    public String getName() {
        return "Apple";
    }

    // Override the getPrice method to return the price of an Apple, which is 0.50.
    @Override
    public double getPrice() {
        return 0.50;
    }
}
