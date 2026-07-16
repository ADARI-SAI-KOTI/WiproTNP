/*Create a new class called Calculator with the following methods:A static method called powerInt(int num1,int num2)This method should return num1 to the power num2.A static method called powerDouble(double num1,int num2).This method should return num1 to the power num2.Invoke both the methods and test the functionalities.Hint: Use Math.pow(double,double) to calculate the power.*/
import java.util.Scanner;
public class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer base: ");
        int baseInt = scanner.nextInt();
        System.out.print("Enter an integer exponent: ");
        int exponentInt = scanner.nextInt();
        int resultInt = powerInt(baseInt, exponentInt);
        System.out.println(baseInt + " to the power of " + exponentInt + " is: " + resultInt);
        System.out.print("Enter a double base: ");
        double baseDouble = scanner.nextDouble();
        System.out.print("Enter an integer exponent: ");
        int exponentDouble = scanner.nextInt();
        double resultDouble = powerDouble(baseDouble, exponentDouble);
        System.out.println(baseDouble + " to the power of " + exponentDouble + " is: " + resultDouble);

        scanner.close();
    }
}