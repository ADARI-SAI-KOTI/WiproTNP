// Create a test class to test the methods available in all these child class.

import com.wipro.automobile.twowheeler.Hero;
import com.wipro.automobile.twowheeler.Honda;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("--- Testing Hero Bike ---");
        Hero hero = new Hero("Hero Splendor", "AP-39-BJ-1234", "Adari Sai Koti", 80);
        System.out.println("Model Name: " + hero.getModelName());
        System.out.println("Registration: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed() + " km/h");
        hero.radio();

        System.out.println("\n--- Testing Honda Bike ---");
        Honda honda = new Honda("Honda Unicorn", "AP-16-CK-5678", "Vamsi Krishna", 95);
        System.out.println("Model Name: " + honda.getModelName());
        System.out.println("Registration: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed() + " km/h");
        honda.cdplayer();
    }
}