// Concrete Command to add a classroom
public class AddClassroomCommand implements Command {
    private ClassroomManager classroomManager; // Object that manages classrooms
    private String command;                    // Command or details to add the classroom

    // Constructor to initialize classroomManager and command
    public AddClassroomCommand(ClassroomManager classroomManager, String command) {
        this.classroomManager = classroomManager;
        this.command = command;
    }

    // Executes the command by invoking the addClassroom method on the classroomManager
    @Override
    public void execute() {
        classroomManager.addClassroom(command);
    }
}
