public class Main {
    public static void main(String[] args) {
        final int NUM_RUNS = 5; // Number of times to run the simulation
        double totalAverageServiceTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            System.out.println("Run " + (i + 1) + ":");
            ServicePoint servicePoint = new ServicePoint();

            // Generate 5 customers
            for (int j = 0; j < 5; j++) {
                servicePoint.addToQueue(new Customer());
            }

            // Start serving customers
            servicePoint.serve();

            // Calculate and print the average service time for this run
            double averageServiceTime = servicePoint.calculateAverageServiceTime();
            System.out.println("Average Service Time for Run " + (i + 1) + ": " + averageServiceTime + "ms\n");
            totalAverageServiceTime += averageServiceTime;
        }

        // Print the overall average service time across all runs
        System.out.println("Overall Average Service Time: " + (totalAverageServiceTime / NUM_RUNS) + "ms");
    }
}
