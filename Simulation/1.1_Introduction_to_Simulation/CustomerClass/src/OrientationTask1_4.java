import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter 'E' to enqueue a new customer, 'D' to dequeue a customer, or 'Q' to quit:");
            input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "E":
                    Customer newCustomer = new Customer();
                    newCustomer.setStartTime(System.nanoTime());
                    queue.addFirst(newCustomer);
                    System.out.println("Customer " + newCustomer.getId() + " added to the queue.");
                    break;
                case "D":
                    if (!queue.isEmpty()) {
                        Customer customer = queue.removeLast();
                        customer.setEndTime(System.nanoTime());
                        System.out.println("Customer " + customer.getId() + " removed from the queue. Time spent in queue: " + (customer.getEndTime() - customer.getStartTime()) + " ns.");
                    } else {
                        System.out.println("The queue is empty.");
                    }
                    break;
                case "Q":
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid input. Please enter 'E', 'D', or 'Q'.");
                    break;
            }
        }
    }
}

