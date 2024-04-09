public class Event implements Comparable<Event> {
    private int eventTime;
    private EventType eventType;

    public Event(int eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public int getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    @Override
    public int compareTo(Event other) {
        return Integer.compare(this.eventTime, other.eventTime);
    }

    @Override
    public String toString() {
        return "Event{" + "eventTime=" + eventTime + ", eventType=" + eventType + '}';
    }
}
