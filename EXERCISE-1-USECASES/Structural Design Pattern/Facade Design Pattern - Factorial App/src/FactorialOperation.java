
// This class implements the MathOperation interface to calculate the factorial of a number.
public class FactorialOperation implements MathOperation {
    @Override
    public double calculate(double number) {
        int result = 1;
        // Compute factorial by multiplying all integers from 1 up to the given number
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
