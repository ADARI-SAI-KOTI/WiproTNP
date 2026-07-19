/*
Given an ArrayList containing 10 numbers, write a program to filter the perfect square numbers.
Example for perfect square numbers: 0, 1, 4, 9, 16, 25, 36, 49, 64 etc..
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 8, 9, 15, 16, 23, 25, 50, 64);
        Predicate<Integer> isPerfectSquare = n -> {
            if (n < 0) return false;
            int sqrt = (int) Math.sqrt(n);
            return (sqrt * sqrt) == n;
        };

        List<Integer> perfectSquares = new ArrayList<>();
        for (int num : numbers) {
            if (isPerfectSquare.test(num)) {
                perfectSquares.add(num);
            }
        }

        System.out.println("Perfect Square Numbers: " + perfectSquares);
    }
}