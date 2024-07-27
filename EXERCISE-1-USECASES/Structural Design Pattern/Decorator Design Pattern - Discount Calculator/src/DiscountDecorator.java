// Concrete Decorator class that adds discount functionality
public class DiscountDecorator extends PriceDecorator {
    private double discount; // Discount percentage

    // Constructor to initialize the decorator with a PriceCalculator and discount
    public DiscountDecorator(PriceCalculator decoratedCalculator, double discount) {
        super(decoratedCalculator);
        this.discount = discount;
    }

    @Override
    public double calculatePrice(double price) {
        // Applies the discount to the price and returns the final price
        return super.calculatePrice(price) * (1 - discount);
    }
}
