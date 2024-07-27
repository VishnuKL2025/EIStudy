//Handler to process ₹50 bills.
 
public class FiftyRupeeHandler extends Handler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getAmount() >= 50;
    }

    @Override
    protected void handle(Request request) {
        int numOfFifties = request.getAmount() / 50;
        int remainder = request.getAmount() % 50;
        System.out.println("Dispensing " + numOfFifties + " ₹50 bills");
        request.setAmount(remainder);
    }
}
