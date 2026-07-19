/*
Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("HR", "Human Resources");
        map.put("IT", "Information Technology");
        map.put("FIN", "Finance");

        System.out.println("a) Checking if key 'IT' exists: " + map.containsKey("IT"));
        System.out.println("b) Checking if value 'Finance' exists: " + map.containsValue("Finance"));

        System.out.println("\nc) Looping through the map using Iterator:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}