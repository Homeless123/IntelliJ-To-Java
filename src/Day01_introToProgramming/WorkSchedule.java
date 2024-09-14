package Day01_introToProgramming;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class WorkSchedule {

    public static void main(String[] args) {
        // Start and end dates
        LocalDate startDate = LocalDate.of(2023, 9, 12);
        LocalDate endDate = LocalDate.of(2024, 9, 29);

        // CSV file to write the data
        String filePath = "Work_Schedule.csv";

        try (FileWriter writer = new FileWriter(filePath)) {
            // Write the headers
            writer.append("Date,Day,Work Hours,Month\n");

            // Variables to keep track of monthly and overall totals
            int overallTotalHours = 0;
            int monthlyTotalHours = 0;
            String currentMonth = "";

            // Iterate through the date range
            for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
                String dayOfWeek = date.getDayOfWeek().name().toLowerCase(Locale.ROOT);
                int workHours = 0;

                // Assign work hours based on the day of the week
                switch (dayOfWeek) {
                    case "monday": workHours = 0; break;
                    case "tuesday": workHours = 10; break;
                    case "wednesday": workHours = 2; break;
                    case "thursday": workHours = 2; break;
                    case "friday": workHours = 4; break;
                    case "saturday": workHours = 4; break;
                    case "sunday": workHours = 3; break;
                }

                // Get the month and year in "MMM yyyy" format
                String month = date.format(DateTimeFormatter.ofPattern("MMM yyyy", Locale.ENGLISH));

                // Check if the month has changed
                if (!month.equals(currentMonth)) {
                    if (!currentMonth.isEmpty()) {
                        // If the month has changed, write the total hours for the previous month
                        writer.append("Total Hours for " + currentMonth + ":," + monthlyTotalHours + "\n");
                    }
                    // Reset the monthly total and update the current month
                    monthlyTotalHours = 0;
                    currentMonth = month;
                }

                // Add to monthly and overall totals
                monthlyTotalHours += workHours;
                overallTotalHours += workHours;

                // Write the data for the current day
                writer.append(date.toString()).append(",")
                        .append(dayOfWeek).append(",")
                        .append(String.valueOf(workHours)).append(",")
                        .append(month).append("\n");
            }

            // Write the final monthly total and overall total
            writer.append("Total Hours for " + currentMonth + ":," + monthlyTotalHours + "\n");
            writer.append("Overall Total:," + overallTotalHours + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Work schedule saved to " + filePath);
    }
}
