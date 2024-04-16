
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TemperatureAverageCalculator {

    public static void main(String[] args) {
        String urlString = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            List<Double> temperatures = new ArrayList<>();
            boolean headerSkipped = false;

            while ((line = reader.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }

                String[] parts = line.split(";");
                String date = parts[0];
                String ulkoTaloTemp = parts[1];

                if (date.startsWith("01.01.2023")) {
                    try {
                        temperatures.add(Double.parseDouble(ulkoTaloTemp.replace(",", ".")));
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid temperature value: " + ulkoTaloTemp);
                    }
                }
            }

            double average = temperatures.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);

            System.out.printf("Average temperature for 1st January 2023: %.2f°C%n", average); // <-- Desimaalit


            reader.close();
        } catch (Exception e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
        }
    }
}
