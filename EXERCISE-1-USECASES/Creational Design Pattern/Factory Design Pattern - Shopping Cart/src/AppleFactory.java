// Define a class named AppleFactory that implements the ProductFactory interface.
public class AppleFactory implements ProductFactory {
    // Override the createProduct method to return a new instance of Apple.
    @Override
    public Product createProduct() {
        return new Apple();
    }
}
