// Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string. Example1) i/p:Wipro o/p:WiWiWiWiWi
public class FirstTwoCharsRepeat {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }

        String str = args[0];
        int n = str.length();

        if (n == 0) {
            System.out.println("");
            return;
        }

        String repeatStr = str.length() < 2 ? str : str.substring(0, 2);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(repeatStr);
        }

        System.out.println(result.toString());
    }
}