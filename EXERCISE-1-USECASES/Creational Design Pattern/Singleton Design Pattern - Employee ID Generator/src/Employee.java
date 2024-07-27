// File: Employee.java
public class Employee {
    private int id;
    private String name;

    public Employee(String name) {
        // Get the singleton instance of EmployeeIDGenerator
        EmployeeIDGenerator idGenerator = EmployeeIDGenerator.getInstance();
        // Assign the next unique ID to this employee
        this.id = idGenerator.getNextID();
        this.name = name;
    }

    // Getters and setters for id and name
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
