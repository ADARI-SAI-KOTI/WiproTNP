/*
Write a program that will have a Properties class object which is capable of storing some States of India and their Capital. Use an Iterator to list all the elements stored in the Properties.
*/

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties statesAndCapitals = new Properties();

        statesAndCapitals.setProperty("Andhra Pradesh", "Amaravati");
        statesAndCapitals.setProperty("Telangana", "Hyderabad");
        statesAndCapitals.setProperty("Maharashtra", "Mumbai");
        statesAndCapitals.setProperty("Karnataka", "Bengaluru");

        System.out.println("Listing States and Capitals using Iterator:");
        Set<String> states = statesAndCapitals.stringPropertyNames();
        Iterator<String> iterator = states.iterator();
        
        while (iterator.hasNext()) {
            String state = iterator.next();
            String capital = statesAndCapitals.getProperty(state);
            System.out.println("State: " + state + ", Capital: " + capital);
        }
    }
}