// Define a class named Banana that implements the Product interface.
public class Banana implements Product {
    // Override the getName method to return "Banana".
    @Override
    public String getName() {
        return "Banana";
    }

    // Override the getPrice method to return the price of a Banana, which is 0.30.
    @Override
    public double getPrice() {
        return 0.30;
    }
}
