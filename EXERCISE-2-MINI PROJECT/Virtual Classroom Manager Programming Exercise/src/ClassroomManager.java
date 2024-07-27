import java.util.HashMap;
import java.util.Map;

public class ClassroomManager {
    private static ClassroomManager instance; // Singleton instance
    private Map<String, Classroom> classrooms = new HashMap<>(); // Map of classrooms by name

    // Private constructor for singleton pattern
    private ClassroomManager() {}

    // Returns the singleton instance of ClassroomManager
    public static synchronized ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    // Adds a new classroom
    public void addClassroom(String command) {
        String[] parts = command.split(" ", 2);
        if (parts.length < 2) {
            System.out.println("Usage: add_classroom [Class Name]");
            return;
        }
        String className = parts[1];
        if (classrooms.containsKey(className)) {
            System.out.println("Classroom already exists.");
            return;
        }
        classrooms.put(className, new Classroom(className));
        System.out.println("Classroom " + className + " has been created.");
    }

    // Adds a student to a classroom
    public void addStudent(String command) {
        String[] parts = command.split(" ", 3);
        if (parts.length < 3) {
            System.out.println("Usage: add_student [Student ID] [Class Name]");
            return;
        }
        String studentId = parts[1];
        String className = parts[2];
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            System.out.println("Classroom does not exist.");
            return;
        }
        if (classroom.getStudent(studentId) != null) {
            System.out.println("Student already enrolled in the class.");
            return;
        }
        Student student = new Student(studentId);
        classroom.addStudent(student);
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    // Schedules an assignment for a classroom
    public void scheduleAssignment(String command) {
        String[] parts = command.split(" ", 3);
        if (parts.length < 3) {
            System.out.println("Usage: schedule_assignment [Class Name] [Assignment Details]");
            return;
        }
        String className = parts[1];
        String assignmentDetails = parts[2];
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            System.out.println("Classroom does not exist.");
            return;
        }
        classroom.scheduleAssignment(assignmentDetails);
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    // Submits an assignment by a student
    public void submitAssignment(String command) {
        String[] parts = command.split(" ", 4);
        if (parts.length < 4) {
            System.out.println("Usage: submit_assignment [Student ID] [Class Name] [Assignment Details]");
            return;
        }
        String studentId = parts[1];
        String className = parts[2];
        String assignmentDetails = parts[3];
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            System.out.println("Classroom does not exist.");
            return;
        }
        Student student = classroom.getStudent(studentId);
        if (student == null) {
            System.out.println("Student is not enrolled in the class.");
            return;
        }
        student.submitAssignment(assignmentDetails);
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }

    // Lists all classrooms with their students and assignments
    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            for (Classroom classroom : classrooms.values()) {
                System.out.println("Classroom: " + classroom.getName());
                System.out.println("Students: " + classroom.getStudents());
                System.out.println("Assignments: " + classroom.getAssignments());
            }
        }
    }
}
