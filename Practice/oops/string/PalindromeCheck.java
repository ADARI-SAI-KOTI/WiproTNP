// Write a Program to check whether a given String is Palindrome or not.
public class PalindromeCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string argument.");
            return;
        }
        
        String original = args[0];
        String cleanStr = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanStr.length() - 1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}