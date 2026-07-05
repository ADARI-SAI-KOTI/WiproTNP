/*Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321*/
import java.util.*;
public class P16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.print(rev);
    }
}