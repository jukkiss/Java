import java.util.LinkedList;
import java.util.List;

public class EventList {
    private List<Event> events;

    public EventList() {
        this.events = new LinkedList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public Event getNextEvent() {
        return events.isEmpty() ? null : events.remove(0);
    }
}
