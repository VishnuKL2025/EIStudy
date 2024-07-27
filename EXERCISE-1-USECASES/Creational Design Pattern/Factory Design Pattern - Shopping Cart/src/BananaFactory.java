// Define a class named BananaFactory that implements the ProductFactory interface.
public class BananaFactory implements ProductFactory {
    // Override the createProduct method to return a new instance of Banana.
    @Override
    public Product createProduct() {
        return new Banana();
    }
}
