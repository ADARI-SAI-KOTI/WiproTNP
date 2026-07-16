/*Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]evenOdd([3, 3, 2]) → [2, 3, 3]evenOdd([2, 2, 2]) → [2, 2, 2]*/
import java.util.*;
public class P10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int evenCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
        }
        int oddCount=n-evenCount;
        int evenArr[]=new int[evenCount];
        int oddArr[]=new int[oddCount];
        int evenIndex=0,oddIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenArr[evenIndex++]=arr[i];
            }else{
                oddArr[oddIndex++]=arr[i];
            }
        }
        System.out.println("The rearranged array is:");
        for(int i=0;i<evenCount;i++){
            System.out.print(evenArr[i]+" ");
        }
        for(int i=0;i<oddCount;i++){
            System.out.print(oddArr[i]+" ");
        }
    }
}