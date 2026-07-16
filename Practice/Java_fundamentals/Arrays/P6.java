/*Write a program to initialize an array and print them in a sorted order.*/
import java.util.*;
public class P6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}