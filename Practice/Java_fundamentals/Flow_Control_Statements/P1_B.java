/*B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. */
import java.util.*;
public class P1_B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1%10==num2%10){
            System.out.print("true");
        }
        else System.out.print("false");
    }
}