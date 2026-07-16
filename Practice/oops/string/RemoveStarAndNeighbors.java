// Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of * Example1) i/p:ab*cd o/p:ad
public class RemoveStarAndNeighbors {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }

        String str = args[0];
        StringBuilder result = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '*') {
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < len - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            result.append(str.charAt(i));
        }

        System.out.println(result.toString());
    }
}