/*
Write a program to count the number of times a character appears in a File. 

[Note :  The character check is case insensitive... i.e, 'a' and 'A' are considered to be the same]

Sample Input and Output:
Enter the file name
Input.txt
Enter the character to be counted
r
File 'Input.txt' has 99 instances of letter 'r'.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = scanner.nextLine();

        System.out.println("Enter the character to be counted");
        String charInput = scanner.nextLine();

        if (charInput.isEmpty()) {
            System.out.println("Error: No character entered.");
            scanner.close();
            return;
        }

        char targetChar = Character.toLowerCase(charInput.charAt(0));
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = br.read()) != -1) {
                if (Character.toLowerCase((char) ch) == targetChar) {
                    count++;
                }
            }
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + charInput.charAt(0) + "'.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}