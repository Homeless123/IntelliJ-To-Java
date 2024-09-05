package day25_constructors;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {
        // Formatter for date with pattern "y/MMM/d/EEEE"
        DateTimeFormatter df = DateTimeFormatter.ofPattern("y/MMM/d/EEEE");
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df)); // Example output: "2024/Aug/30/Friday"

        // Formatter for date with pattern "MMMM-dd-yy"
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("MMMM-dd-yy");
        LocalDate specificDate = LocalDate.of(2022, 7, 1);
        System.out.println(specificDate.format(df1)); // Output: "July-01-22"

        // Formatter for time with pattern "h:m"
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m");
        LocalTime time1 = LocalTime.of(19, 25);
        System.out.println(time1.format(tf)); // Output: "7:25"

    }

}
