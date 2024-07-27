// File: EmployeeManagement.java
import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee Registration System");
        System.out.print("Enter the number of employees to register: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter name for employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            Employee employee = new Employee(name);// In singleton, We can create single object in main method
            System.out.println(employee);
        }

        scanner.close();
    }
}
