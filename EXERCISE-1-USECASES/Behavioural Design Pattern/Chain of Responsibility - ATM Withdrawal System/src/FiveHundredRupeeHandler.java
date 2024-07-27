/**
 * Handler to process ₹500 bills.
 */
public class FiveHundredRupeeHandler extends Handler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getAmount() >= 500;
    }

    @Override
    protected void handle(Request request) {
        int numOfFiveHundreds = request.getAmount() / 500;
        int remainder = request.getAmount() % 500;
        System.out.println("Dispensing " + numOfFiveHundreds + " ₹500 bills");
        request.setAmount(remainder);
    }
}
