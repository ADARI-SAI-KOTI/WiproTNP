// Create objects of the relevant classes and test the various functionalities of the class.

import com.wipro.automobile.fourwheeler.Ford;
import com.wipro.automobile.fourwheeler.Logan;

public class TestFourWheeler {
    public static void main(String[] args) {
        System.out.println("--- Testing Logan Sedan ---");
        Logan logan = new Logan("Mahindra Logan", "KA-51-MD-9876", "Adari Sai Koti", 120);
        System.out.println("Model Name: " + logan.getModelName());
        System.out.println("Registration: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Current Speed: " + logan.speed() + " km/h");
        logan.gps();

        System.out.println("\n--- Testing Ford SUV ---");
        Ford ford = new Ford("Ford Endeavour", "MH-12-FE-4321", "Sai Ram", 140);
        System.out.println("Model Name: " + ford.getModelName());
        System.out.println("Registration: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Current Speed: " + ford.speed() + " km/h");
        ford.tempControl();
    }
}