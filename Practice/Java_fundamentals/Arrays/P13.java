/*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.Example1)C:>java Sample 1 2 3O/P: Please enter 4 integer numbersExample2)C:>java Sample 1 2 3 4O/P:The given array is :1 23 4The reverse of the array is :4 32 1*/
public class P13{
    public static void main(String args[]){
        int arr[][]=new int[2][2];
        if(args.length!=4){
            System.out.println("Please enter 4 integer numbers");
        }
        else{
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    arr[i][j]=Integer.parseInt(args[i*2+j]);
                }
            }
            System.out.println("The given array is :");
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("The reverse of the array is :");
            for(int i=1;i>=0;i--){
                for(int j=1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}