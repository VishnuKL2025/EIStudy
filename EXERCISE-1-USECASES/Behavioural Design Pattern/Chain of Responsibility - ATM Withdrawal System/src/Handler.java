/**
 * Abstract handler class for the chain of responsibility pattern.
 */
public abstract class Handler {
    private Handler nextHandler;

    // Set the next handler in the chain
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Process the request and pass it along the chain if necessary
    public void processRequest(Request request) {
        if (canHandle(request)) {
            handle(request);
        }
        if (nextHandler != null && request.getAmount() > 0) {
            nextHandler.processRequest(request);
        }
    }

    // Abstract method to determine if the handler can process the request
    protected abstract boolean canHandle(Request request);

    // Abstract method to handle the request
    protected abstract void handle(Request request);
}
