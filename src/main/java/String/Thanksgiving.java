package String;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class Thanksgiving {
    public static LocalDate getThanksgivingDate(int year) {
        // Start with November 1st of the given year
        LocalDate novemberFirst = LocalDate.of(year, 11, 1);

        // Find the first Thursday of November
        LocalDate firstThursday = novemberFirst.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));

        // Move to the fourth Thursday
        LocalDate thanksgiving = firstThursday.plusWeeks(3);

        return thanksgiving;
    }

    public static void main(String[] args) {
        int year = 2024; // Specify the year you want
        LocalDate thanksgivingDate = getThanksgivingDate(year);
        System.out.println("Thanksgiving in " + year + " is on: " + thanksgivingDate);

        //Thanksgiving in 2024 is on: 2024-11-28
    }
}

