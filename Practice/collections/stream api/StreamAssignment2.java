/*
Create an Employee class with
1. Instance variables: empNo, name, age, location.
2. A parameterized constructor to initialize them.

Write a program
1. To add five Employee objects into an ArrayList ,
2. Filter the Employee objects whose location is Pune,
3. Store them in a separate ArrayList and print their details.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + empNo + ", Name=" + name + ", Age=" + age + ", Location=" + location + "]";
    }
}

public class StreamAssignment2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Amit", 28, "Pune"));
        employeeList.add(new Employee(2, "Rohan", 32, "Mumbai"));
        employeeList.add(new Employee(3, "Neha", 24, "Pune"));
        employeeList.add(new Employee(4, "Rahul", 30, "Bangalore"));
        employeeList.add(new Employee(5, "Priya", 27, "Pune"));
        ArrayList<Employee> puneEmployees = employeeList.stream()
                .filter(emp -> "Pune".equalsIgnoreCase(emp.location))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Employees located in Pune:");
        puneEmployees.forEach(System.out::println);
    }
}