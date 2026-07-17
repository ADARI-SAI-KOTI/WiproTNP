import com.wipro.automobile.ship.Compartment1;

public class TestShipCompartment {
    public static void main(String[] args) {
        Compartment1 shipCabin = new Compartment1(12.5, 8.2, 15.0);

        System.out.println("--- Ship Compartment Details ---");
        System.out.println(shipCabin);

        System.out.println("\nModifying attributes...");
        shipCabin.setHeight(14.0);
        shipCabin.setWidth(9.5);

        System.out.println("Updated Height: " + shipCabin.getHeight() + " meters");
        System.out.println("Updated Width: " + shipCabin.getWidth() + " meters");
        System.out.println("Breadth: " + shipCabin.getBreadth() + " meters");
    }
}