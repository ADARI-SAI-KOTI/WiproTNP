/*
Given an ArrayList containing 10 numbers, write a program using Consumer methods to display each number and whether is it odd or even.
Example: For number 2, it should print "2 even" For number 5, it should print "5 odd"
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 5, 8, 21, 4, 15, 18, 9, 2, 7);
        Consumer<Integer> oddEvenReporter = n -> {
            if (n % 2 == 0) {
                System.out.println(n + " even");
            } else {
                System.out.println(n + " odd");
            }
        };

        numbers.forEach(oddEvenReporter);
    }
}