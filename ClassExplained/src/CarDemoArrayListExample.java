import java.util.ArrayList;

public class CarDemoArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Add another Volvo
        cars.add("Volvo");

        // Print Cars
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
