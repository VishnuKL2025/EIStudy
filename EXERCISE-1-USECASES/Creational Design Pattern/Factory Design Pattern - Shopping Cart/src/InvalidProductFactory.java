// Define a class named InvalidProductFactory that implements the ProductFactory interface.
public class InvalidProductFactory implements ProductFactory {
    // Override the createProduct method to return a new instance of InvalidProduct.
    @Override
    public Product createProduct() {
        return new InvalidProduct();
    }
}
