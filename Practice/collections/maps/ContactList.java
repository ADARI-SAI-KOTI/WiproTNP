/*
Create a Collection “ContactList” using HashMap to store name and phone number of contacts added. The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Alice", 987654321);
        contacts.put("Bob", 876543210);
        contacts.put("Charlie", 765432109);

        System.out.println("a) Check if 'Bob' exists: " + contacts.containsKey("Bob"));
        System.out.println("b) Check if number 987654321 exists: " + contacts.containsValue(987654321));

        System.out.println("\nc) Looping through contacts using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}