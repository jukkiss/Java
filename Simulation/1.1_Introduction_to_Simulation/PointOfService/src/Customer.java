
public class Customer {
    private final long arrivalTime;

    public Customer() {
        this.arrivalTime = System.currentTimeMillis();
    }

    public long getArrivalTime() {
        return arrivalTime;
    }
}
