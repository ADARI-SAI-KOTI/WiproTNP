/*
Given an ArrayList containing 10 numbers, write a program to calculate the sum of all the elements, with the help of Function.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterface2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        Function<List<Integer>, Integer> sumCalculator = list -> {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        };

        int totalSum = sumCalculator.apply(numbers);
        System.out.println("Sum of all elements: " + totalSum);
    }
}