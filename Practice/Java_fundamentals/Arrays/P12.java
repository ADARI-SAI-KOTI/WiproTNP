/*Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]

middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]

middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]*/
import java.util.*;
public class P12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter the elements of the first array:");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the second array:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter the elements of the second array:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int result[]=new int[2];
        result[0]=arr1[1];
        result[1]=arr2[1];
        System.out.println("The middle elements of both arrays are: "+Arrays.toString(result));
    }
}