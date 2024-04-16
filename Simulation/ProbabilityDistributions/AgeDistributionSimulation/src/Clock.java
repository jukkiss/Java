public class Clock {
    private static Clock instance;
    private long currentTime;

    // Private constructor to prevent instantiation from outside
    private Clock() {
        currentTime = 0; // Initialize the clock to start at time 0
    }

    // Public method to access the singleton instance of Clock
    public static synchronized Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Method to get the current time
    public synchronized long getTime() {
        return currentTime;
    }

    // Method to set the current time
    public synchronized void setTime(long newTime) {
        if (newTime >= currentTime) { // Ensuring time does not move backwards
            currentTime = newTime;
        } else {
            throw new IllegalArgumentException("New time must be greater than or equal to current time.");
        }
    }

    // Optionally, add a method to advance time by some increment
    public synchronized void advanceTime(long increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Time increment must be non-negative.");
        }
        currentTime += increment;
    }
}
