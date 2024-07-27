
// This class provides a simplified interface for calculating the factorial of a number.
// It acts as a facade, hiding the complexity of the underlying operation.
public class MathOperationsFacade {
    private MathOperation factorialOperation;

    public MathOperationsFacade() {
        // Initialize the factorial operation
        this.factorialOperation = new FactorialOperation();
    }

    // Method to calculate factorial using the factorialOperation
    public double calculateFactorial(double number) {
        return factorialOperation.calculate(number);
    }
}
