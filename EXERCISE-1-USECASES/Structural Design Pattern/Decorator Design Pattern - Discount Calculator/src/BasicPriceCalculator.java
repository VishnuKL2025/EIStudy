// Concrete Component that implements the base component interface
public class BasicPriceCalculator implements PriceCalculator {
    @Override
    public double calculatePrice(double price) {
        // Returns the original price without any modifications
        return price;
    }
}
