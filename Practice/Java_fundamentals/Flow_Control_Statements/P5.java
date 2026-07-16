/*Initialize a character variable in a program andprint 'Alphabhet' if the initialized value is an alphabhet,print 'Digit' if the initialized value is a number, andprint 'Special Character', if the initialized value is anything else.*/
import java.util.*;
public class P5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
            System.out.print("Alphabet");
        }
        else if(ch>=0&&ch<=9){
            System.out.print("Digit");
        }
        else System.out.print("Special Character");
    }
}