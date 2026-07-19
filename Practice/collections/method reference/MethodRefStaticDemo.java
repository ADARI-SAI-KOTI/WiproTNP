/*
Define your own class with a static method "int digitCount(int n)" which should return the number of digits in a given input "n". 
Define your own functional interface to refer this static method and invoke it to get the number of digits.
*/

interface CountInterface {
    int getCount(int n);
}

class NumberUtils {
    public static int digitCount(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
}

public class MethodRefStaticDemo {
    public static void main(String[] args) {
        CountInterface counter = NumberUtils::digitCount;

        int number = 123456;
        System.out.println("Number of digits in " + number + " is: " + counter.getCount(number));
    }
}