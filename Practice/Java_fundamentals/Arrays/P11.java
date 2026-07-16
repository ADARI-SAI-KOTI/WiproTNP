/*Given an array of type int, print true if every element is 1 or 4.

only14([1, 4, 1, 4]) → true

only14([1, 4, 2, 4]) → false

only14([1, 1]) → true*/
import java.util.*;
public class P11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(arr[i]!=1 && arr[i]!=4){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}