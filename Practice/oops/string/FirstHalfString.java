// Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string. Example1) i/p:TomCat o/p:Tom Example2) i/p:Apron o/p:null
public class FirstHalfString {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }

        String str = args[0];

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0, str.length() / 2));
        } else {
            System.out.println("null");
        }
    }
}