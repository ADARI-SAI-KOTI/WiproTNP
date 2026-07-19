/*
Write a program 
1. To filter the negative even numbers from an ArrayList,
2. Store them into a new ArrayList,
3. Print the ArrayList elements.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssignment1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, -4, 7, -8, -5, -10, 0, -3, 14);

        System.out.println("Original List: " + numbers);
        ArrayList<Integer> negativeEvenNumbers = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Filtered Negative Even Numbers: " + negativeEvenNumbers);
    }
}