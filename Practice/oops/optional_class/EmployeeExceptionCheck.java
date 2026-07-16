// Given an Employee object which may be initialized to null, use Optional class to check if it is null and to throw an user defined exception InvalidEmployeeException.
import java.util.Optional;

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeExceptionCheck {
    public static void main(String[] args) {
        Employee emp = null; 

        try {
            Employee result = Optional.ofNullable(emp)
                .orElseThrow(() -> new InvalidEmployeeException("InvalidEmployeeException: Employee data is null."));
            
            System.out.println("Employee Name: " + result.getName());
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}