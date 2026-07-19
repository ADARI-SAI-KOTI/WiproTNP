/*
Create an interface WordCount with a single abstract method int count(String str), to count and return the no of words in the given String. 
Implement count method using Lambda expression in another class MyClassWithLambda.
Invoke it to display the result on the console.
*/

interface WordCount {
    int count(String str);
}

public class MyClassWithLambda {
    public static void main(String[] args) {
        WordCount wordCounter = str -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            return str.trim().split("\\s+").length;
        };

        String sampleText = "Lambda expressions make Java more expressive and powerful";
        int totalWords = wordCounter.count(sampleText);

        System.out.println("Input String: \"" + sampleText + "\"");
        System.out.println("Number of words: " + totalWords);
    }
}