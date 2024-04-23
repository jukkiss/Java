public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(10);
        Thread[] threads = new Thread[15];

        for (int i = 0; i < threads.length; i++) {
            int tickets = (int) (Math.random() * 5) + 1;
            threads[i] = new Thread(new Customer(i + 1, tickets, theater));
            threads[i].start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}