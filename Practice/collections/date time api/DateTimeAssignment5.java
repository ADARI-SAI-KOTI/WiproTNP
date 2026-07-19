/*
Write a program to display the current time and the time after 25 minutes.
*/

import java.time.LocalTime;

public class DateTimeAssignment5 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime after25Mins = currentTime.plusMinutes(25);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Time after 25 minutes: " + after25Mins);
    }
}