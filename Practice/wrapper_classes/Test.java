/*
Write a program to receive an integer number as a command line argument, and print the binary, octal and hexadecimal equivalent of the given number.

Sample Output:

java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
*/

public class Test {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an integer number as a command line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            System.out.println("Given Number :" + number);
            System.out.println("Binary equivalent :" + Integer.toBinaryString(number));
            System.out.println("Octal equivalent :" + Integer.toOctalString(number));
            System.out.println("Hexadecimal equivalent :" + Integer.toHexString(number));

        } catch (NumberFormatException e) {
            System.out.println("Error: The argument provided is not a valid integer.");
        }
    }
}