// Handler to process ₹200 bills.
 
public class TwoHundredRupeeHandler extends Handler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getAmount() >= 200;
    }

    @Override
    protected void handle(Request request) {
        int numOfTwoHundreds = request.getAmount() / 200;
        int remainder = request.getAmount() % 200;
        System.out.println("Dispensing " + numOfTwoHundreds + " ₹200 bills");
        request.setAmount(remainder);
    }
}
