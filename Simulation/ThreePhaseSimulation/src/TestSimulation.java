public class TestSimulation {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event(5, EventType.ARRIVAL));
        eventList.addEvent(new Event(2, EventType.EXIT));
        eventList.addEvent(new Event(4, EventType.ARRIVAL));
        eventList.addEvent(new Event(3, EventType.EXIT));
        eventList.addEvent(new Event(1, EventType.ARRIVAL));

        System.out.println("First event removed: " + eventList.getNextEvent());

        System.out.println("Remaining Events:");
        eventList.printEvents();
    }
}
