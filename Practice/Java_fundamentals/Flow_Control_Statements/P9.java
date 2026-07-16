/*Write a program to receive a number and print the corresponding month name.   

Example1)   

C:>java Sample 12   

O/P Expected : December   

Example2)   

C:>java Sample   

O/P Expected : Please enter the month in numbers   

Example3)   

C:>java Sample 15   

O/P Expected : Invalid month*/
public class P9{
    public static void main(String[] args){
        if(args.length==0){
            System.out.print("Please enter the month in numbers");
        }
        else{
            int month=Integer.parseInt(args[0]);
            switch(month){
                case 1 -> System.out.print("January");
                case 2 -> System.out.print("February");
                case 3 -> System.out.print("March");
                case 4 -> System.out.print("April");
                case 5 -> System.out.print("May");
                case 6 -> System.out.print("June");
                case 7 -> System.out.print("July");
                case 8 -> System.out.print("August");
                case 9 -> System.out.print("September");
                case 10 -> System.out.print("October");
                case 11 -> System.out.print("November");
                case 12 -> System.out.print("December");
                default -> System.out.print("Invalid month");
            }
        }
    }
}