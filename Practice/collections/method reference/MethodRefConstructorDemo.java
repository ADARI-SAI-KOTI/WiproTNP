/*
Define your own class and a parameterized constructor with one integer argument. It should check the argument and display "Prime" or "Not Prime". 
Define your own functional interface to refer this constructor and invoke it to check whether the given number is Prime or Not.
*/

interface PrimeCheckerProvider {
    NumberChecker getChecker(int n);
}

class NumberChecker {
    public NumberChecker(int n) {
        if (n <= 1) {
            System.out.println(n + " is Not Prime");
            return;
        }
        
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}

public class MethodRefConstructorDemo {
    public static void main(String[] args) {
        PrimeCheckerProvider provider = NumberChecker::new;
        provider.getChecker(17);
        provider.getChecker(25);
    }
}