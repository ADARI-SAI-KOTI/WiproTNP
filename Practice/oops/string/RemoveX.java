// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. If the input is "xHix", then output is "Hi". If the input is "America", then the output is "America".
public class RemoveX {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }

        String str = args[0];
        int len = str.length();

        if (len == 0) {
            System.out.println("");
            return;
        }

        int start = 0;
        int end = len;

        if (str.charAt(0) == 'x') {
            start = 1;
        }
        
        if (len > 1 && str.charAt(len - 1) == 'x') {
            end = len - 1;
        }

        if (start >= end) {
            System.out.println("");
        } else {
            System.out.println(str.substring(start, end));
        }
    }
}