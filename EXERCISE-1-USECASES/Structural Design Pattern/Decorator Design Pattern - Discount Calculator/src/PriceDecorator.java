// Abstract Decorator class that implements the PriceCalculator interface
public abstract class PriceDecorator implements PriceCalculator {
    // Reference to a PriceCalculator object
    protected PriceCalculator decoratedCalculator;

    // Constructor to initialize the decorator with a PriceCalculator
    public PriceDecorator(PriceCalculator decoratedCalculator) {
        this.decoratedCalculator = decoratedCalculator;
    }

    @Override
    public double calculatePrice(double price) {
        // Delegates the price calculation to the decorated calculator
        return decoratedCalculator.calculatePrice(price);
    }
}
