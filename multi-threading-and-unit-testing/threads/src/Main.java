public class Main {
    public static void main(String[] args) {
        int maxNumber = 20;
        NumberPrinter printer = new NumberPrinter(maxNumber);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted.");
        }
        System.out.println("Printing complete.");
    }
}
