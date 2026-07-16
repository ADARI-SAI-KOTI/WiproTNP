// Given two StringJoiners s1 and s2 which contains n city names separated by - (hyphen), display the output for the given cases: i) s1 merged to s2. ii) s2 merged to s1.
import java.util.StringJoiner;

public class MergeStringJoiners {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Mumbai");
        s1.add("Kolkata");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Chennai");
        s2.add("Hyderabad");
        s2.add("Bangalore");

        StringJoiner s1Copy = new StringJoiner("-").merge(s1);
        StringJoiner s2Copy = new StringJoiner("-").merge(s2);

        System.out.println("i) s1 merged to s2:");
        s2Copy.merge(s1);
        System.out.println(s2Copy.toString());

        System.out.println("ii) s2 merged to s1:");
        s1Copy.merge(s2);
        System.out.println(s1Copy.toString());
    }
}