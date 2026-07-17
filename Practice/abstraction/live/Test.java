// Write another class Test in a package called live. Then,
// a. Create an instance of Veena and call play() method
// b. Create an instance of Saxophone and call play() method
// c. Place the above instances in a variable of type Playable and then call play()

package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        System.out.println("--- Directly invoking play() via class instances ---");
        Veena veenaInstance = new Veena();
        veenaInstance.play();

        Saxophone saxophoneInstance = new Saxophone();
        saxophoneInstance.play();

        System.out.println("\n--- Invoking play() polymorphically using Playable interface reference ---");
        Playable playableRef;

        playableRef = veenaInstance;
        playableRef.play();

        playableRef = saxophoneInstance;
        playableRef.play();
    }
}