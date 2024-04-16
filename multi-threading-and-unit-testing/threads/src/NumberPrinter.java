public class NumberPrinter {
    private int current = 1;
    private final int max;

    public NumberPrinter(int max) {
        this.max = max;
    }

    public synchronized void printOdd() {
        while (current <= max) {
            while (current % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted");
                }
            }
            if (current <= max) {
                System.out.println("Odd Thread: " + current);
                current++;
                notifyAll();
            }
        }
    }

    public synchronized void printEven() {
        while (current <= max) {
            while (current % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted");
                }
            }
            if (current <= max) {
                System.out.println("Even Thread: " + current);
                current++;
                notifyAll();
            }
        }
    }
}

