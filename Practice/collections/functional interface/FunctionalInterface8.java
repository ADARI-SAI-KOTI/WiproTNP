/*
Write a program using Supplier, which generates and returns an ArrayList containing first 10 prime numbers.
*/

import java.util.ArrayList;
import java.util.function.Supplier;

public class FunctionalInterface8 {
    public static void main(String[] args) {
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;
            while (primes.size() < 10) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primes.add(num);
                }
                num++;
            }
            return primes;
        };

        ArrayList<Integer> first10Primes = primeSupplier.get();
        System.out.println("First 10 Prime Numbers: " + first10Primes);
    }
}