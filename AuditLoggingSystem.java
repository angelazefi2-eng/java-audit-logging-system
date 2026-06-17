import java.io.FileWriter;
import java.time.LocalDateTime;

public class AuditLoggingSystem {

    public static void main(String[] args) {

        try {

            // Create or open the log file
            FileWriter file = new FileWriter("audit_logs.txt", true);

            // Write a login attempt event with timestamp
            file.write(LocalDateTime.now() + " - LOGIN ATTEMPT\n");

            // Write a logout event with timestamp
            file.write(LocalDateTime.now() + " - LOGOUT\n");

            // Write an error event with timestamp
            file.write(LocalDateTime.now() + " - ERROR\n");

            // Close the file
            file.close();

            // Display success message
            System.out.println("Logs saved successfully.");

        } catch (Exception e) {

            // Display error message if something goes wrong
            System.out.println("Error saving logs.");

        }

    }
}