import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> events;

    public EventList() {
        this.events = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public Event getNextEvent() {
        return events.poll();
    }

    public void printEvents() {
        while (!events.isEmpty()) {
            System.out.println(events.poll());
        }
    }
}
