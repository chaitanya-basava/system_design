package communication.strategies.sd;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Component
public class ScheduledTask {

    private volatile String preparedValue = null;
    private static final long intervalInSeconds = 10;
    private long lastExecutionTime = 0;

    public ScheduledTask() {
        startTask();
    }

    // Method to start the scheduled task
    private void startTask() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule the task to run at fixed intervals
        scheduler.scheduleAtFixedRate(() -> {
            preparedValue = prepareValue();
            lastExecutionTime = System.currentTimeMillis();
            System.out.println("Value prepared at " + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
        }, 0, intervalInSeconds, TimeUnit.SECONDS);
    }

    // Method to prepare the value
    private String prepareValue() {
        // Simulate preparation of value
        return "Prepared Value at " + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now());
    }

    // Method to get the value, returns null if called before an interval
    public String getValue() {
        long currentTime = System.currentTimeMillis();

        // Check if enough time has passed since the last execution
        if(preparedValue == null && currentTime - lastExecutionTime < intervalInSeconds * 1000) {
            return null;  // Return null if called before the next scheduled execution
        }

        String value = preparedValue;
        preparedValue = null;
        return value;  // Return the prepared value otherwise
    }
}
