import java.io.FileWriter;
import java.io.IOException;

public class FibonacciToCSV {
    public static void main(String[] args) {
        int count = 100;
        long[] fibonacci = new long[count];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        try (FileWriter writer = new FileWriter("fibonacci.csv")) {
            for (int i = 0; i < fibonacci.length; i++) {
                writer.write(fibonacci[i] + (i < fibonacci.length - 1 ? "," : "\n"));
            }
            System.out.println("Fibonacci sequence written to fibonacci.csv");
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
