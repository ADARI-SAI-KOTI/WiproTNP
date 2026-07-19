/*
Given an ArrayList with 5 Employee(id,name,location,salary) objects,
write a program to extract the location details of each Employee and store it in an ArrayList , with the help of Function.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Rahul", "Bangalore", 25000));
        list.add(new Employee(2, "Priya", "Pune", 30000));
        list.add(new Employee(3, "Amit", "Mumbai", 45000));
        list.add(new Employee(4, "Neha", "Pune", 35000));
        list.add(new Employee(5, "Rohan", "Hyderabad", 40000));
        Function<Employee, String> locationExtractor = emp -> emp.location;

        List<String> locations = new ArrayList<>();
        for (Employee emp : list) {
            locations.add(locationExtractor.apply(emp));
        }

        System.out.println("Extracted Locations: " + locations);
    }
}