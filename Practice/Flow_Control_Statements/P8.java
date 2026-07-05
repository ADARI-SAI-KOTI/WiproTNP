/*Write a program to receive a color code from the user (an Alphabhet).   

The program should then print the color name, based on the color code given.   

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.   

If color code provided by the user is not valid then print "Invalid Code".*/
import java.util.*;
public class P8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'R' -> System.out.print("Red");
            case 'B' -> System.out.print("Blue");
            case 'G' -> System.out.print("Green");
            case 'O' -> System.out.print("Orange");
            case 'Y' -> System.out.print("Yellow");
            case 'W' -> System.out.print("White");
            default -> System.out.print("Invalid Code");
        }
    }
}