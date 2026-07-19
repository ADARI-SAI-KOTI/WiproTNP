import java.util.ArrayList;

public class StringOperationsArrays {

    public static ArrayList<String> performStringOperations(String s1, String s2) {
        ArrayList<String> results = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                sb1.append(s2);
            } else {
                sb1.append(s1.charAt(i));
            }
        }
        results.add(sb1.toString());

        int firstOccur2 = s1.indexOf(s2);
        int lastOccur2 = s1.lastIndexOf(s2);
        if (firstOccur2 != -1 && firstOccur2 != lastOccur2) {
            String reverseS2 = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, lastOccur2) + reverseS2 + s1.substring(lastOccur2 + s2.length());
            results.add(op2);
        } else {
            results.add(s1 + s2);
        }

        if (firstOccur2 != -1 && firstOccur2 != lastOccur2) {
            String op3 = s1.substring(0, firstOccur2) + s1.substring(firstOccur2 + s2.length());
            results.add(op3);
        } else {
            results.add(s1);
        }

        int n = s2.length();
        int splitIndex = (n % 2 == 0) ? (n / 2) : ((n / 2) + 1);
        String firstHalf = s2.substring(0, splitIndex);
        String secondHalf = s2.substring(splitIndex);
        results.add(firstHalf + s1 + secondHalf);

        StringBuilder sb5 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (s2.indexOf(c) != -1) {
                sb5.append('*');
            } else {
                sb5.append(c);
            }
        }
        results.add(sb5.toString());

        return results;
    }

    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";

        ArrayList<String> output = performStringOperations(s1, s2);
        System.out.println(output);
    }
}