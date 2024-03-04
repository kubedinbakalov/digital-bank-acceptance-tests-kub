package co.wedevx.digitalbank.automation.ui.steps.data_transformers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataTimeFormat {


    // Create a Date object representing the current date and time
        Date currentDate = new Date();

        // Convert the Date object to a LocalDateTime object
        LocalDateTime currentDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        // Add 5 hours to the current date and time
        LocalDateTime newDateTime = currentDateTime.plusHours(5);

        // Format the new date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = newDateTime.format(formatter);

        // Print the new date and time


    public String getFormattedDateTime() {
        return formattedDateTime;
    }
}
