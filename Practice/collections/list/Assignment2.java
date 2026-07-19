/*
1) Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender 
v)float salary
vi) void GetEmployeeDetails() -> prints employee details

b) Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId

Provide implementation for all the methods and test your program.
*/

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void GetEmployeeDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Email: " + email + ", Gender: " + gender + ", Salary: " + salary);
    }
}

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().empId == empId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip for " + e.empName + " (ID: " + e.empId + "): Basic Salary = $" + e.salary;
            }
        }
        return "Employee not found.";
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        Employee emp1 = new Employee(101, "Alice", "alice@example.com", "Female", 50000f);
        Employee emp2 = new Employee(102, "Bob", "bob@example.com", "Male", 60000f);

        db.addEmployee(emp1);
        db.addEmployee(emp2);

        System.out.println("--- Employee Details ---");
        emp1.GetEmployeeDetails();
        emp2.GetEmployeeDetails();

        System.out.println("\n--- Pay Slip ---");
        System.out.println(db.showPaySlip(101));

        System.out.println("\n--- Deleting Employee 101 ---");
        if (db.deleteEmployee(101)) {
            System.out.println("Employee 101 deleted successfully.");
        }
    }
}