/*
Create an ArrayList al and add 25 random numbers. 
Write a code to print all the prime numbers that are present in it, using lambda expression.
*/

import java.util.ArrayList;
import java.util.Random;

public class LambdaPrimeTest {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            al.add(random.nextInt(100) + 1);
        }

        System.out.println("Generated Random Numbers: " + al);
        System.out.println("Prime Numbers in the list:");

        al.forEach(n -> {
            if (n > 1) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(n + " ");
                }
            }
        });
        System.out.println();
    }
}