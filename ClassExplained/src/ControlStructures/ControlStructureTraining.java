package ControlStructures;
import java.util.Scanner;

public class ControlStructureTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();


        //Write an if-else sentence

        if (number < 0) {
            System.out.println("Number is less than zero");
        } else {
            System.out.println("Number is more than Zero or zero");
        }
        //Invalid input gives an error since we are taking an int

        //Write an if-else if-else statement

        if (number < 0) {
            System.out.println("Number is less than zero");
        } else if (number > 0) {
            System.out.println("Number is greater than zero");
        }

        //Write a switch/case
        int numberthree = 3;

        switch(numberthree) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 3:
                System.out.println("The number is three.");
                break;
            default:
                System.out.println("The number is neither one or three.");
                break;
        }



    }
}
