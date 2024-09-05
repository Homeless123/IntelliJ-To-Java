package day25_constructors;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {
        // Current date and time
                LocalDateTime start = LocalDateTime.now();
                System.out.println(start);
        // Specific date and time
                LocalDateTime end = LocalDateTime.of(2023,05,18,11,0);
                System.out.println(end);
        System.out.println(start.getDayOfWeek());
        System.out.println(start.getHour());
                // Get individual components

        // Add days and print the result

    }

    }
