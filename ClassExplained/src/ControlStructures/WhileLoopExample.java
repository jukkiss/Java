package ControlStructures;
import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number != 0) {
            if (number < 0) {
                System.out.println("Number is smaller than zero.");
            } else if (number > 0) {
                System.out.println("Number is greater than zero");
            }
            System.out.println("Give another number.");
            number = Integer.parseInt(scanner.nextLine());
        }
    }
}
