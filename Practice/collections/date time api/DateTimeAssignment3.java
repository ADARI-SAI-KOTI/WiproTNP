/*
Write a program to calculate your experience (no of years, no of months & no of days) in Wipro.
*/

import java.time.LocalDate;
import java.time.Period;

public class DateTimeAssignment3 {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2024, 6, 15); 
        LocalDate currentDate = LocalDate.now();

        Period experience = Period.between(joiningDate, currentDate);

        System.out.println("Total Experience in Wipro:");
        System.out.println(experience.getYears() + " Years, " 
                           + experience.getMonths() + " Months, " 
                           + experience.getDays() + " Days");
    }
}