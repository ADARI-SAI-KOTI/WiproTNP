/*
Write a program that will have a Vector which is capable of storing Employee objects. Use an Iterator and enumeration to list all the elements of the Vector.
*/

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class VEmployee {
    int id;
    String name;

    public VEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + "]";
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Vector<VEmployee> employeeVector = new Vector<>();

        employeeVector.add(new VEmployee(1, "John"));
        employeeVector.add(new VEmployee(2, "Sarah"));
        employeeVector.add(new VEmployee(3, "David"));

        System.out.println("--- Listing using Iterator ---");
        Iterator<VEmployee> iterator = employeeVector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n--- Listing using Enumeration ---");
        Enumeration<VEmployee> enumeration = employeeVector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}