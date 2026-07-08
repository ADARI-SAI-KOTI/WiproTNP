/*Write a program to initialize an integer array and print the sum and average of the array.*/
import java.util.Scanner;
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        double avg=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            avg=(double)sum/n;
        }
        System.out.print(sum+"  "+avg);
    }
}