import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, String mobileNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Employee other) {
        return this.firstName.compareToIgnoreCase(other.firstName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Employee> employeeSet = new TreeSet<>();

        System.out.println("Enter the Number of Employees");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter Employee " + i + " Details:");
            System.out.println("Enter the Firstname");
            String firstName = scanner.nextLine();
            
            System.out.println("Enter the Lastname");
            String lastName = scanner.nextLine();
            
            System.out.println("Enter the Mobile");
            String mobile = scanner.nextLine();
            
            System.out.println("Enter the Email");
            String email = scanner.nextLine();
            
            System.out.println("Enter the Address");
            String address = scanner.nextLine();

            employeeSet.add(new Employee(firstName, lastName, mobile, email, address));
        }

        System.out.println("Employee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        
        for (Employee emp : employeeSet) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
                    emp.getFirstName(), 
                    emp.getLastName(), 
                    emp.getMobileNumber(), 
                    emp.getEmail(), 
                    emp.getAddress());
        }

        scanner.close();
    }
}