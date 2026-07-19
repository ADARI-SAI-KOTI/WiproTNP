/*
Create an ArrayList al and add 10 different words.
Write a code to print all the Strings whose length is odd, using lambda expression.
*/

import java.util.ArrayList;

public class LambdaOddLengthWords {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("cat");
        al.add("elephant");
        al.add("dog");
        al.add("lion");
        al.add("tiger");
        al.add("bear");
        al.add("cheetah");
        al.add("fox");
        al.add("wolf");
        al.add("giraffe");

        System.out.println("Words with an odd length:");
        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word + " (Length: " + word.length() + ")");
            }
        });
    }
}