public class Clock {
    private static Clock instance;
    private long currentTime;


    private Clock() {
        currentTime = 0;
    }

    public static synchronized Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public synchronized long getTime() {
        return currentTime;
    }

    public synchronized void setTime(long newTime) {
        if (newTime >= currentTime) { // Ensuring time does not move backwards
            currentTime = newTime;
        } else {
            throw new IllegalArgumentException("New time must be greater than or equal to current time.");
        }
    }

    public synchronized void advanceTime(long increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Time increment must be non-negative.");
        }
        currentTime += increment;
    }
}
