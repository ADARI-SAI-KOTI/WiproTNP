/*Write a program to print the sum of the elements of an array following the given below condition.If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.Eg1) Array Elements - 10,3,6,1,2,7,9O/P: 22 [i.e 10+3+9]Eg2) Array Elements - 7,1,2,3,6O/P:19Eg3) Array Elements - 1,6,4,7,9O/P:10*/
import java.util.*;

public class P8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 6) {
                int j = i;

                // Check if 7 exists ahead
                while (j < n && arr[j] != 7) {
                    j++;
                }

                if (j < n) {
                    // 7 found → skip whole block
                    i = j; // jump to 7
                } else {
                    // No 7 → include 6
                    sum += arr[i];
                }
            } else {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}