import java.util.List;
import java.util.ArrayList;

public class TestArrivalProcess {
    public static void main(String[] args) {
        List<Event> events = new ArrayList<>(); // Correct type specification
        Clock clock = Clock.getInstance(); // Using Singleton pattern correctly
        ArrivalProcess process = new ArrivalProcess(0.1); // Lambda rate

        process.generateArrivals(events, 10, clock); // Generate 10 arrival events

        for (Event event : events) {
            System.out.println(event);
        }
    }
}
