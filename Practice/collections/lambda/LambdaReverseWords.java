/*
Create an ArrayList al and add 10 different words. 
Write a code to print all the Strings in reverse order, using lambda expression.
*/

import java.util.ArrayList;

public class LambdaReverseWords {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("banana");
        al.add("cherry");
        al.add("date");
        al.add("elderberry");
        al.add("fig");
        al.add("grape");
        al.add("honeydew");
        al.add("kiwi");
        al.add("lemon");

        System.out.println("Words with characters reversed:");
        al.forEach(word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
        });
    }
}