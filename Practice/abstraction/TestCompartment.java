// Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. public abstract String notice();
// Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of compartment.
// Create a class TestCompartment. Write main function to do the following: Declare an array of Compartment of size 10. Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4. Check the polymorphic behavior of the notice method. [i.e based on the random number generated, the first compartment can be Luggage, the second one could be Ladies and so on..]

import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is a First Class compartment. Authorized tickets required.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Notice: This compartment is reserved exclusively for Ladies.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is a General compartment. Open for all passengers.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Notice: This compartment is for Luggage and goods carriage only.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int choice = random.nextInt(4) + 1; // Generates a random integer from 1 to 4

            compartments[i] = switch (choice) {
                case 1 -> new FirstClass();
                case 2 -> new Ladies();
                case 3 -> new General();
                case 4 -> new Luggage();
                default -> throw new IllegalStateException("Unexpected random value: " + choice);
            };
        }

        System.out.println("Displaying the notice for each compartment in the train:");
        System.out.println("==========================================================");
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Coach " + (i + 1) + " -> " + compartments[i].notice());
        }
    }
}