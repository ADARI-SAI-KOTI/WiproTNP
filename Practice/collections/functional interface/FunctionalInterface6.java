/*
Given an ArrayList containing 10 words, write a program to reverse each word and 
update the same ArrayList , with the help of Consumer.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface6 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
            "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"
        ));

        System.out.println("Original List: " + words);
        Consumer<List<String>> listReverser = list -> {
            for (int i = 0; i < list.size(); i++) {
                String rev = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, rev);
            }
        };

        listReverser.accept(words);

        System.out.println("Updated List: " + words);
    }
}