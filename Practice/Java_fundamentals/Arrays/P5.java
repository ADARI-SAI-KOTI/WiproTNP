/* Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.*/
import java.util.*;
public class P5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The largest 2 numbers are: "+arr[n-1]+" and "+arr[n-2]);
        System.out.println("The smallest 2 numbers are: "+arr[0]+" and "+arr[1]);
    }
}