/*Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *  */
public class P15{
    public static void main(String[] args){
        if(args.length==0){
            System.out.print("please enter an integer number");
        }
        else {
            int number = Integer.parseInt(args[0]);
            for(int i=0;i<number;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}