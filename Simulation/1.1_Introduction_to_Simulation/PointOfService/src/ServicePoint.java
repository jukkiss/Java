import java.util.LinkedList;
import java.util.ArrayList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private ArrayList<Long> serviceTimes = new ArrayList<>();

    public void addToQueue(Customer customer) {
        queue.addLast(customer);
    }

    public Customer removeFromQueue() {
        return queue.poll();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueue();
            long serviceTime = (long) (Math.random() * 1000); // Simulate service time between 0 and 1000 milliseconds
            serviceTimes.add(serviceTime); // Store the service time
            try {
                Thread.sleep(serviceTime); // Simulate the service task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();
            long responseTime = endTime - customer.getArrivalTime();
            System.out.println("Customer served. Response time: " + responseTime + "ms, Service time: " + serviceTime + "ms.");
        }
    }

    public double calculateAverageServiceTime() {
        return serviceTimes.stream().mapToLong(val -> val).average().orElse(0.0);
    }
}
