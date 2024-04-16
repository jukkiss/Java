import java.util.Queue;
import java.util.LinkedList;

public class ServicePoint {
    private Queue<Customer> queue;

    public ServicePoint() {
        this.queue = new LinkedList<>();
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
    }

    public Customer serveCustomer() {
        return queue.poll();
    }
}

