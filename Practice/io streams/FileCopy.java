/*
Write a program to copy contents from one file to another and check the output.

Sample Input and Output:
Enter the input file name
Input.txt
Enter the output file name
Output.txt
File is copied.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFile = scanner.nextLine();

        System.out.println("Enter the output file name");
        String outputFile = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            
            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(ch);
            }
            
            System.out.println("File is copied.");
            
        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}