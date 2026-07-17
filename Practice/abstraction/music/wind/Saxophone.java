// Write a class called Saxophone which implements Playable interface. Let this class be placed in a package music.wind

package music.wind;

import music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Saxophone: Producing a smooth wind jazz melody.");
    }
}