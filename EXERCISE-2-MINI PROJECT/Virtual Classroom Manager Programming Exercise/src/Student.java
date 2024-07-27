import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;                              // Student ID
    private List<String> submittedAssignments = new ArrayList<>(); // List of assignments submitted by the student

    // Constructor to initialize the student with an ID
    public Student(String id) {
        this.id = id;
    }

    // Returns the student's ID
    public String getId() {
        return id;
    }

    // Adds an assignment to the list of submitted assignments
    public void submitAssignment(String assignment) {
        submittedAssignments.add(assignment);
    }

    // Returns a string representation of the student (ID)
    @Override
    public String toString() {
        return id;
    }
}
