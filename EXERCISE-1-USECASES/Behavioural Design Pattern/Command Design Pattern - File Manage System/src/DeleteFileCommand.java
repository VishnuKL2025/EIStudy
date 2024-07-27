// Concrete Command to delete a file
public class DeleteFileCommand implements Command {
    private Receiver receiver;  // Object that performs the actual file deletion
    private String filename;    // Name of the file to be deleted

    // Constructor to initialize receiver and filename
    public DeleteFileCommand(Receiver receiver, String filename) {
        this.receiver = receiver;
        this.filename = filename;
    }

    // Executes the command by invoking the deleteFile method on the receiver
    @Override
    public void execute() {
        receiver.deleteFile(filename);
    }
}
