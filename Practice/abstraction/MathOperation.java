/*
Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result. 

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
*/

public class MathOperation {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new IllegalArgumentException("Please provide exactly 5 integers as command line arguments.");
            }

            int[] arr = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }

            double average = (double) sum / arr.length;

            System.out.println("Sum of elements: " + sum);
            System.out.println("Average of elements: " + average);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Please ensure all arguments are valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: An arithmetic error occurred during calculation.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}