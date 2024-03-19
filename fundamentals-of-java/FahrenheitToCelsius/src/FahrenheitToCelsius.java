import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Ask user degrees in Fahrenheit
        System.out.println("Give temperature in fahrenheit: ");
        //Take the input
        int fahr = Integer.parseInt(scanner.nextLine());
        //Convert the input to Celsius and print the result
        double cels = (fahr - 32) / 1.8;
        String formattedCels = String.format("%.1f", cels);
        System.out.println("Temperature in Celsius: " + formattedCels);
    }
}
