import java.util.Scanner;
public class IntegersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number: ");
        int third = Integer.parseInt(scanner.nextLine());

        //Fixed to double
        int sum = first + second + third;
        int product = first * second * third;
        double average = sum / 3.0;

        System.out.println("The sum of numbers is: " + sum);
        System.out.println("The product of the numbers is: " + product);
        System.out.println("The average of the numbers is: " + average);
    }
}
