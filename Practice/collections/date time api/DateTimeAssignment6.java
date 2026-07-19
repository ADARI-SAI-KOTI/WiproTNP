/*
Write a program to display the current time and the time before 5 hours and 30 minutes.
*/

import java.time.LocalTime;

public class DateTimeAssignment6 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTime = currentTime.minusHours(5).minusMinutes(30);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Time before 5 hours and 30 minutes: " + targetTime);
    }
}