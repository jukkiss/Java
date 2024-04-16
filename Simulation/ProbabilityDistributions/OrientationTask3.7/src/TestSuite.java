public class TestSuite {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess(0.1); // example rate
        ServicePoint servicePoint = new ServicePoint();

        arrivalProcess.generateArrivals(eventList, 10, clock);

        Event event;
        while ((event = eventList.getNextEvent()) != null) {
            servicePoint.addCustomer(new Customer(event.getTime()));
        }

        clock.setTime(clock.getTime() + 5);

        Customer customer;
        while ((customer = servicePoint.serveCustomer()) != null) {
            long timeInSystem = clock.getTime() - customer.getArrivalTime();
            System.out.println("Customer spent " + timeInSystem + " units in system.");
        }

        System.out.println("Final time: " + clock.getTime());
    }
}
