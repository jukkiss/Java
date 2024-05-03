package ControlStructures;
import java.util.Scanner;


public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Give a number:");
            number = Integer.parseInt(scanner.nextLine());

            if (number > 0) {
                System.out.println("The number is positive.");
            }
            else if (number < 0) {
                System.out.println("The number is not positive.");
            }
        } while (number != 0);
    }
}
