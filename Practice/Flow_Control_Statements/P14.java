/*Write a program to print the sum of all the digits of a given number.*/
import java.util.*;
public class P14{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.print(sum);
    }
}