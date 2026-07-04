/*Write a program to check if the program has received command line arguments or not.If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)*/
public class P3{
    public static void main(String[] args){
        if(args.length==0){
            System.out.print("no values");
        }
        else {
            for (String arg : args) {
                System.out.print(arg);
                if (arg != null) {
                    System.out.print(",");
                }
            }
        }
    }
}