// Concrete Command to submit an assignment
public class SubmitAssignmentCommand implements Command {
    private ClassroomManager classroomManager; // Object that manages classrooms
    private String command;                    // Command or details for submitting the assignment

    // Constructor to initialize classroomManager and command
    public SubmitAssignmentCommand(ClassroomManager classroomManager, String command) {
        this.classroomManager = classroomManager;
        this.command = command;
    }

    // Executes the command by invoking the submitAssignment method on the classroomManager
    @Override
    public void execute() {
        classroomManager.submitAssignment(command);
    }
}
