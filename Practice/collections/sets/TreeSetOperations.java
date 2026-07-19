/*
Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.
*/

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Cherry");
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        System.out.println("b) Iterating elements using Iterator (Natural Order):");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\na) Reversing the elements of the Collection:");
        TreeSet<String> reversedSet = (TreeSet<String>) set.descendingSet();
        System.out.println(reversedSet);

        System.out.println("\nc) Checking if a particular element exists:");
        String searchTarget = "Banana";
        if (set.contains(searchTarget)) {
            System.out.println("'" + searchTarget + "' exists in the TreeSet.");
        } else {
            System.out.println("'" + searchTarget + "' does not exist in the TreeSet.");
        }
    }
}