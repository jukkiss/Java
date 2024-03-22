import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give temperature in fahrenheit: ");
        int fahr = Integer.parseInt(scanner.nextLine());
        double cels = (fahr - 32) / 1.8;
        String formattedCels = String.format("%.1f", cels);
        System.out.println("Temperature in Celsius: " + formattedCels);
    }
}
