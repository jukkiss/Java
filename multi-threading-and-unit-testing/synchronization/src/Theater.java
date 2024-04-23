public class Theater {
    private int seatsAvailable;

    public Theater(int totalSeats) {
        this.seatsAvailable = totalSeats;
    }

    public synchronized String reserveTickets(int customerID, int requestSeats) {
        if (requestSeats <= seatsAvailable) {
            seatsAvailable -= requestSeats;
            return "Customer " + customerID + " reserved " + requestSeats + " tickets.";
        } else {
            return "Customer " + customerID + " couldn't reserve " + requestSeats + " tickets.";
        }
    }
}

class Customer implements Runnable {
    private int id;
    private int requestedTickets;
    private Theater theater;

    public Customer(int id, int tickets, Theater theater) {
        this.id = id;
        this.requestedTickets = tickets;
        this.theater = theater;
    }

    @Override
    public void run() {
        String result = theater.reserveTickets(id, requestedTickets);
        System.out.println(result);
    }
}


