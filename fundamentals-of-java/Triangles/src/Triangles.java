import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first triangle side: ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second triangle side: ");
        int second = Integer.parseInt(scanner.nextLine());
        double hypotenuse = Math.sqrt(first * first + second * second);
        System.out.println("The length of the hypotenuse is: " + String.format("%.1f", hypotenuse));

    }
}
