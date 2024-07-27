// Concrete Command to create a file
public class CreateFileCommand implements Command {
    private Receiver receiver;  // Object that performs the actual file creation
    private String filename;    // Name of the file to be created

    // Constructor to initialize receiver and filename
    public CreateFileCommand(Receiver receiver, String filename) {
        this.receiver = receiver;
        this.filename = filename;
    }

    // Executes the command by invoking the createFile method on the receiver
    @Override
    public void execute() {
        receiver.createFile(filename);
    }
}
