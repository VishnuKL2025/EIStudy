// Concrete Command to update a file
public class UpdateFileCommand implements Command {
    private Receiver receiver;  // Object that performs the actual file update
    private String filename;    // Name of the file to be updated
    private String content;     // Content to be appended to the file

    // Constructor to initialize receiver, filename, and content
    public UpdateFileCommand(Receiver receiver, String filename, String content) {
        this.receiver = receiver;
        this.filename = filename;
        this.content = content;
    }

    // Executes the command by invoking the updateFile method on the receiver
    @Override
    public void execute() {
        receiver.updateFile(filename, content);
    }
}
