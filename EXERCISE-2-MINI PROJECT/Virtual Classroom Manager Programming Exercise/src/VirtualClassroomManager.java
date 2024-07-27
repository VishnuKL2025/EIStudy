import java.util.Scanner;

public class VirtualClassroomManager {
    private ClassroomManager classroomManager = ClassroomManager.getInstance(); // Singleton instance of ClassroomManager
    private Scanner scanner = new Scanner(System.in); // Scanner for user input

    // Entry point of the application
    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        manager.processCommands(); // Start processing commands
    }

    // Continuously processes user commands
    private void processCommands() {
        while (true) {
            String command = promptForCommand(); // Get command from user
            if (command.equals("exit")) {
                System.out.println("Exiting...");
                break; // Exit the loop if the command is "exit"
            }
            handleCommand(command); // Handle the command
        }
    }

    // Prompts the user for a command and returns it
    private String promptForCommand() {
        System.out.println("Enter command:");
        return scanner.nextLine();
    }

    // Handles the given command by creating and executing the appropriate Command object
    private void handleCommand(String command) {
        Command cmd = createCommand(command); // Create the command based on user input
        if (cmd != null) {
            try {
                cmd.execute(); // Execute the command
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage()); // Print any errors
            }
        } else {
            System.out.println("Unknown command."); // Inform the user if the command is unknown
        }
    }

    // Creates a Command object based on the input string
    private Command createCommand(String command) {
        if (command.startsWith("add_classroom")) {
            return new AddClassroomCommand(classroomManager, command);
        } else if (command.startsWith("add_student")) {
            return new AddStudentCommand(classroomManager, command);
        } else if (command.startsWith("schedule_assignment")) {
            return new ScheduleAssignmentCommand(classroomManager, command);
        } else if (command.startsWith("submit_assignment")) {
            return new SubmitAssignmentCommand(classroomManager, command);
        } else if (command.equals("list_classrooms")) {
            return new ListClassroomsCommand(classroomManager);
        }
        return null; // Return null if the command does not match any known types
    }
}
