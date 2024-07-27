// Class to represent the withdrawal request with an amount.
 
public class Request {
    private int amount;

    public Request(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
