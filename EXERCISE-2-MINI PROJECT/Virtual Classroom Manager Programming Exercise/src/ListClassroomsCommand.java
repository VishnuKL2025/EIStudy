// Concrete Command to list all classrooms
public class ListClassroomsCommand implements Command {
    private ClassroomManager classroomManager; // Object that manages classrooms

    // Constructor to initialize classroomManager
    public ListClassroomsCommand(ClassroomManager classroomManager) {
        this.classroomManager = classroomManager;
    }

    // Executes the command by invoking the listClassrooms method on the classroomManager
    @Override
    public void execute() {
        classroomManager.listClassrooms();
    }
}
