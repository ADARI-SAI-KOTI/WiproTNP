/*
Define your own class with an instance method "int factorial(int n)" which should return the factorial of the given input "n". 
Define your own functional interface to refer this instance method and invoke it to get the factorial result.
*/

interface FactorialCalculator {
    int calculate(int n);
}

class MathOperations {
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class MethodRefInstanceDemo {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        
        FactorialCalculator calc = mathOps::factorial;

        int number = 5;
        System.out.println("Factorial of " + number + " is: " + calc.calculate(number));
    }
}