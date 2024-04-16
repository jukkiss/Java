public class ParallelSum {
    private static class SumTask extends Thread {
        private final int[] array;
        private final int start;
        private final int end;
        private long sum = 0;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
        }

        public long getSum() {
            return sum;
        }
    }

    public static long parallelSum(int[] array, int threadCount) {
        int length = array.length;
        int part = length / threadCount;
        SumTask[] tasks = new SumTask[threadCount];
        for (int i = 0; i < threadCount; i++) {
            int start = i * part;
            int end = (i == threadCount - 1) ? length : start + part;
            tasks[i] = new SumTask(array, start, end);
            tasks[i].start();
        }

        long totalSum = 0;
        for (SumTask task : tasks) {
            try {
                task.join();
                totalSum += task.getSum();
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        int threadCount = Runtime.getRuntime().availableProcessors();
        long sum = parallelSum(numbers, threadCount);
        System.out.println("Total sum is: " + sum);
    }
}
