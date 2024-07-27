import java.util.Scanner;

// Main class (Client) that sets up commands and invokes them
public class FileManagementSystem {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();  // Receiver that performs file operations
        Invoker invoker = new Invoker();      // Invoker that triggers commands
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter command (create/delete/update): ");
        String commandType = scanner.nextLine(); // Read the command type from user

        System.out.println("Enter filename: ");
        String filename = scanner.nextLine(); // Read the filename from user

        Command command;
        if ("update".equalsIgnoreCase(commandType)) {
            // For "update" command, get additional content input
            System.out.println("Enter content to append: ");
            String content = scanner.nextLine();
            command = new UpdateFileCommand(receiver, filename, content);
        } else {
            // For "create" or "delete" commands, use the getCommand method
            command = getCommand(commandType, receiver, filename);
        }

        invoker.setCommand(command); // Set the command in the invoker
        invoker.invoke(); // Execute the command

        scanner.close(); // Close the scanner
    }

    // Factory method to get the appropriate command based on user input
    private static Command getCommand(String commandType, Receiver receiver, String filename) {
        return switch (commandType.toLowerCase()) {
            case "create" -> new CreateFileCommand(receiver, filename);
            case "delete" -> new DeleteFileCommand(receiver, filename);
            default -> throw new IllegalArgumentException("Invalid command type: " + commandType);
        };
    }
}
