import java.util.List;
import java.util.Random;

public class ArrivalProcess {
    private final Random random;
    private final double rate; // Lambda for exponential distribution

    public ArrivalProcess(double rate) {
        this.random = new Random();
        this.rate = rate;
    }

    public void generateArrivals(List<Event> eventList, int count, Clock clock) {
        for (int i = 0; i < count; i++) {
            double interval = -Math.log(1 - random.nextDouble()) / rate;
            long nextArrivalTime = clock.getTime() + (long) interval;
            clock.setTime(nextArrivalTime); // Update clock to the time of the next event
            eventList.add(new Event("Arrival", nextArrivalTime));
        }
    }
}

class Event {
    private String type;
    private long time;

    public Event(String type, long time) {
        this.type = type;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "type='" + type + '\'' +
                ", time=" + time +
                '}';
    }
}
