import java.util.TreeSet;

public class CarDemoTreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo"); // Tämä ei lisää toista Volvoa, koska TreeSet ei salli duplikaatteja

        // Tulostetaan autot järjestetyssä järjestyksessä
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
