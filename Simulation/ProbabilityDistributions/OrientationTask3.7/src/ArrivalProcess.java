import java.util.Random;

public class ArrivalProcess {
    private Random random;
    private double rate;

    public ArrivalProcess(double rate) {
        this.random = new Random();
        this.rate = rate;
    }

    public void generateArrivals(EventList eventList, int count, Clock clock) {
        for (int i = 0; i < count; i++) {
            double interval = -Math.log(1 - random.nextDouble()) / rate;
            long nextArrivalTime = clock.getTime() + (long) interval;
            eventList.addEvent(new Event(EventType.ARRIVAL, nextArrivalTime));
            clock.setTime(nextArrivalTime); // Update clock to time of the next event
        }
    }
}
