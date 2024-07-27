// Concrete Command to add a student
public class AddStudentCommand implements Command {
    private ClassroomManager classroomManager; // Object that manages classrooms
    private String command;                    // Command or details to add the student

    // Constructor to initialize classroomManager and command
    public AddStudentCommand(ClassroomManager classroomManager, String command) {
        this.classroomManager = classroomManager;
        this.command = command;
    }

    // Executes the command by invoking the addStudent method on the classroomManager
    @Override
    public void execute() {
        classroomManager.addStudent(command);
    }
}
