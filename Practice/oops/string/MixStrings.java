// Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. Any characters left, will go to the end of the result. Example1) i/p:Hello,World o/p:HWeolrllod
public class MixStrings {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two strings as command line arguments.");
            return;
        }

        String a = args[0];
        String b = args[1];
        StringBuilder result = new StringBuilder();
        
        int i = 0;
        while (i < a.length() || i < b.length()) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
            i++;
        }

        System.out.println(result.toString());
    }
}