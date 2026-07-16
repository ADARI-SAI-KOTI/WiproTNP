// Given an ArrayList containing n names, use StringJoiner to construct a new sequence of names separated by , (comma) and enclosed in { } brackets.
import java.util.ArrayList;
import java.util.StringJoiner;

public class JoinNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for(String arg : args) {
            names.add(arg);
        }

        if (names.isEmpty()) {
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
        }

        StringJoiner sj = new StringJoiner(", ", "{", "}");
        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj.toString());
    }
}