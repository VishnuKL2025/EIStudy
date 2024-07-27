
 // Handler to process ₹100 bills.
public class OneHundredRupeeHandler extends Handler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getAmount() >= 100;
    }

    @Override
    protected void handle(Request request) {
        int numOfOneHundreds = request.getAmount() / 100;
        int remainder = request.getAmount() % 100;
        System.out.println("Dispensing " + numOfOneHundreds + " ₹100 bills");
        request.setAmount(remainder);
    }
}
