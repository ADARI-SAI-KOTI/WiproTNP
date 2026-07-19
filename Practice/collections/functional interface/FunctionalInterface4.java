/*
Create an Employee class with three private variables id, name and salary.
Create getters & setters and a parameterized constructor.

Create an ArrayList and store 5 to 10 Employee objects in it. 
Write a program using Predicate, to filter and display the name of the employees whose salary is less than 10000.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class SimpleEmployee {
    private int id;
    private String name;
    private double salary;

    public SimpleEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}

public class FunctionalInterface4 {
    public static void main(String[] args) {
        List<SimpleEmployee> employees = new ArrayList<>();
        employees.add(new SimpleEmployee(101, "John", 12000));
        employees.add(new SimpleEmployee(102, "Anil", 8500));
        employees.add(new SimpleEmployee(103, "Sunita", 15000));
        employees.add(new SimpleEmployee(104, "David", 9500));
        employees.add(new SimpleEmployee(105, "Sarah", 11000));
        Predicate<SimpleEmployee> lowSalaryFilter = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");
        for (SimpleEmployee emp : employees) {
            if (lowSalaryFilter.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}