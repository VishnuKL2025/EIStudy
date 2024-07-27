import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private String name;                      // Name of the classroom
    private Map<String, Student> students = new HashMap<>(); // Map of students by their ID
    private List<String> assignments = new ArrayList<>();    // List of assignments

    // Constructor to initialize the classroom with a name
    public Classroom(String name) {
        this.name = name;
    }

    // Returns the name of the classroom
    public String getName() {
        return name;
    }

    // Adds a student to the classroom
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    // Retrieves a student by their ID
    public Student getStudent(String id) {
        return students.get(id);
    }

    // Schedules a new assignment for the classroom
    public void scheduleAssignment(String assignment) {
        assignments.add(assignment);
    }

    // Returns the list of assignments
    public List<String> getAssignments() {
        return assignments;
    }

    // Returns the map of students
    public Map<String, Student> getStudents() {
        return students;
    }
}
