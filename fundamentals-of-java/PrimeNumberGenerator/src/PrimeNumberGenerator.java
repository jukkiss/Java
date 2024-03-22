import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;

        System.out.println("Enter the start number: ");
        start = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the end number: ");
        end = Integer.parseInt(scanner.nextLine());

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
