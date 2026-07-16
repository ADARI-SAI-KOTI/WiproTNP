// Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi".
public class ShortLongShort {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two strings as command line arguments.");
            return;
        }

        String a = args[0];
        String b = args[1];

        if (a.length() < b.length()) {
            System.out.println(a + b + a);
        } else {
            System.out.println(b + a + b);
        }
    }
}