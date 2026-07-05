/*Write a Java program to find if the given number is palindrome or not

Example1)
C:>java Sample 110011
O/P: 110011 is a palindrome*/
import java.util.*;
public class P17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,temp=n;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(rev==temp) System.out.print(temp+" is a palindrome");
        else System.out.print(temp+" is not a palindrome");
    }
}