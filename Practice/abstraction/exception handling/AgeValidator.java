/*
Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
Display proper error messages. 

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)
*/

class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super();
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Error: Please provide both name and age as command line arguments.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Error: Age must be greater than or equal to 18 and less than 60.");
            }

            System.out.println("Registration successful for " + name + " (Age: " + age + ")");

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid integer.");
        } catch (IllegalArgumentException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}