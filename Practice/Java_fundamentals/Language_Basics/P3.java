/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers */
public class P3{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    }
}