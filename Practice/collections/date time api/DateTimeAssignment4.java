/*
Write a program to check whether the current year is a leap year.
*/

import java.time.LocalDate;

public class DateTimeAssignment4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        boolean isLeap = today.isLeapYear();

        System.out.println("Current Year: " + today.getYear());
        if (isLeap) {
            System.out.println("The current year is a leap year.");
        } else {
            System.out.println("The current year is not a leap year.");
        }
    }
}