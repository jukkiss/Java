import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];

        System.out.println("Enter the integers: ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;


        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += array[k];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    startIndex = start;
                    endIndex = end;
                }
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers "
                + (startIndex + 1) + " - " + (endIndex + 1));
    }
}
