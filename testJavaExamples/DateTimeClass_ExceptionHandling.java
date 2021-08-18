import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeClass_ExceptionHandling {
    public static void main(String[] args) {
        try { //adding try catch to catch the exception returned and sent a readable error message "Something went wrong"
            LocalDateTime time = LocalDateTime.now(); //returns the current time
            ZoneId estZoneId = ZoneId.of("America/New_York");
            LocalTime timeNow = LocalTime.now(estZoneId);

            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");//DD MM YYYY HH:mm:ss pattern was passed, exception would have been returned.
            String formattedTime = timeNow.format(myFormatObj);
            System.out.println("Time of New York is: " + formattedTime);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally { //Irrespective of the catch being returned, finally is executed.
            System.out.println("Time is returned, else exception is returned");
        }
    }

}
