/*
Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
*/

import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            try {
                System.out.println("Enter name of Student " + i + ":");
                String name = scanner.nextLine();

                int totalMarks = 0;
                System.out.println("Enter marks for 3 subjects:");

                for (int j = 1; j <= 3; j++) {
                    System.out.print("Subject " + j + ": ");
                    String input = scanner.nextLine();
                    
                    int marks = Integer.parseInt(input);

                    if (marks < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }
                    if (marks > 100) {
                        throw new OutOfRangeException("Marks must be in the range of 0 to 100.");
                    }

                    totalMarks += marks;
                }

                double average = totalMarks / 3.0;
                System.out.println("Average marks for " + name + " = " + average + "\n");

            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getClass().getName() + " - Please enter integer values only.\n");
            } catch (NegativeValueException | OutOfRangeException e) {
                System.out.println("Error: " + e.getClass().getName() + " - " + e.getMessage() + "\n");
            }
        }
        scanner.close();
    }
}