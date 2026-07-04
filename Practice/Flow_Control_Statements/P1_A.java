/* Write a program to check if a given integer number is Positive, Negative, or Zero.*/
import java.util.*;
public class P1_A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println(num+" is a Positive Number");
        }
        else if(num<0){
            System.out.println(num+" is a Negative Number");
        }
        else{
            System.out.println("number is Zero");
        }
    }
}