// File: EmployeeIDGenerator.java
public class EmployeeIDGenerator {
    private static EmployeeIDGenerator instance;
    private int currentID;

    // Private constructor to prevent instantiation
    private EmployeeIDGenerator() {
        currentID = 1000; // Starting ID
    }

    // Public method to provide access to the instance
    public static synchronized EmployeeIDGenerator getInstance() {
        if (instance == null) {
            instance = new EmployeeIDGenerator();
        }
        return instance;
    }

    // Synchronized method to generate and return the next unique ID
    public synchronized int getNextID() {
        return currentID++;
    }
}
