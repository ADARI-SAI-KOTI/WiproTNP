/*
Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.
*/

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();

        employees.add("Alice");
        employees.add("Bob");
        employees.add("Charlie");
        employees.add("David");

        System.out.println("Listing employees using Iterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}