// Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase. Note:If the concatenation creates a double-char, then one of the characters need to be omitted. Example1) i/p:Sachin,Tendulkar o/p:sachin tendulkar Example2) i/p:Mark,kate o/p:markate
public class ConcatenateStrings {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two strings as command line arguments.");
            return;
        }

        String str1 = args[0];
        String str2 = args[1];

        if (str1.length() > 0 && str2.length() > 0) {
            char lastChar = str1.charAt(str1.length() - 1);
            char firstChar = str2.charAt(0);

            if (Character.toLowerCase(lastChar) == Character.toLowerCase(firstChar)) {
                str2 = str2.substring(1);
            }
        }

        String result = (str1 + str2).toLowerCase();
        System.out.println(result);
    }
}