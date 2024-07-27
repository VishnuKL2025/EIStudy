// Invoker class that calls the command's execute method
public class Invoker {
    private Command command; // Command to be executed

    // Sets the command to be invoked
    public void setCommand(Command command) {
        this.command = command;
    }

    // Calls the execute method of the command
    public void invoke() {
        command.execute();
    }
}
