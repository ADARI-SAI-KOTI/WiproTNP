/*
Write a program to find the date of next month second Sunday.
*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAssignment2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfNextMonth = today.plusMonths(1).withDayOfMonth(1);
        LocalDate firstSunday = firstDayOfNextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Next month's second Sunday date: " + secondSunday);
    }
}