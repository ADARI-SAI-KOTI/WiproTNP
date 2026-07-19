import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}

public class EmployeeManagementSystem {
    private static final String FILE_NAME = "employees.dat";

    @SuppressWarnings("unchecked")
    private static List<Employee> readEmployees() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Employee>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private static void writeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            System.out.println("Error saving employee details.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in == null ? new ByteArrayInputStream(new byte[0]) : System.in);
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Employee Age: ");
                int age = scanner.nextInt();
                System.out.print("Enter Employee Salary: ");
                double salary = scanner.nextDouble();

                List<Employee> employees = readEmployees();
                employees.add(new Employee(id, name, age, salary));
                writeEmployees(employees);

            } else if (choice == 2) {
                List<Employee> employees = readEmployees();
                System.out.println("---- Report -----");
                for (Employee emp : employees) {
                    System.out.println(emp);
                }
                System.out.println("---- End of Report -----");
            } else if (choice == 3) {
                System.out.println("Exiting the System");
                break;
            }
        }
        scanner.close();
    }
}