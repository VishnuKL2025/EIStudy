// Concrete Command to schedule an assignment
public class ScheduleAssignmentCommand implements Command {
    private ClassroomManager classroomManager; // Object that manages classrooms
    private String command;                    // Command or details for scheduling the assignment

    // Constructor to initialize classroomManager and command
    public ScheduleAssignmentCommand(ClassroomManager classroomManager, String command) {
        this.classroomManager = classroomManager;
        this.command = command;
    }

    // Executes the command by invoking the scheduleAssignment method on the classroomManager
    @Override
    public void execute() {
        classroomManager.scheduleAssignment(command);
    }
}
