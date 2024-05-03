package ControlStructures;
import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        Scanner scanner;

        int number = 10;
        int number2 = -20;
        // if
        if (number > 0) {
            System.out.println("The number is positive.");
        }


        // if-else
        if (number2 > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        // switch
        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            default:
                System.out.println("The number is neither one nor two.");
        }

        //Break Statements: Essential in switch/case to terminate a case.
        scanner = new Scanner(System.in);

        //while loop
        while (number != 0) {
            if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is not positive.");
            }
            number = scanner.nextInt();
        }

        //do-while loop

        do {
            System.out.println("Enter a number:");
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is not positive.");
            }
        } while (number != 0);

        //for Loop

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Nested Loops

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        //Logical operators: Control logical operations within conditions (&&, ||, !)
        //



    }
}
