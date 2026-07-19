/*
Given an ArrayList containing 10 words, write a program to filter the words which are palindrome, with the help of Predicate.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("radar", "hello", "level", "java", "deed", "world", "racecar", "noon", "stream", "kayak");
        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed);
        };

        List<String> palindromeWords = new ArrayList<>();
        for (String word : words) {
            if (isPalindrome.test(word)) {
                palindromeWords.add(word);
            }
        }

        System.out.println("Palindrome words: " + palindromeWords);
    }
}