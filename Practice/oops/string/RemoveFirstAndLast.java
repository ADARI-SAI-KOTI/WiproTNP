// Write a java program that accepts a string and returns a new string without the first and last character of the input string. Example1) i/p:Suman o/p:uma
public class RemoveFirstAndLast {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }

        String str = args[0];

        if (str.length() <= 2) {
            System.out.println("");
        } else {
            System.out.println(str.substring(1, str.length() - 1));
        }
    }
}