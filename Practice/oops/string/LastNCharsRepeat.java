// Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive. Example1) i/p:Wipro,3 o/p:propropro
public class LastNCharsRepeat {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a string and an integer as command line arguments.");
            return;
        }

        String str = args[0];
        int n;
        
        try {
            n = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Second argument must be an integer.");
            return;
        }

        if (n <= 0 || str.length() < n) {
            System.out.println("");
            return;
        }

        String targetSub = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(targetSub);
        }

        System.out.println(result.toString());
    }
}