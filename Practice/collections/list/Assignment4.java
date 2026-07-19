/*
Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.
*/

import java.util.ArrayList;

public class Assignment4 {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();

        numberList.add(10);        
        numberList.add(20.5f);     
        numberList.add(30.99);     
        numberList.add(40L);       

        System.out.println("Numeric elements in the list:");
        for (Number num : numberList) {
            System.out.println(num + " (" + num.getClass().getSimpleName() + ")");
        }
    }
}