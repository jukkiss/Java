import java.util.HashMap;

public class CarDemoHashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> carOwners = new HashMap<>();
        carOwners.put("Volvo", "Alice");
        carOwners.put("BMW", "Bob");
        carOwners.put("Ford", "Charlie");
        carOwners.put("Mazda", "Diane");

        String ownerOfBMW = carOwners.get("BMW");
        System.out.println("BMW:n omistaja on " + ownerOfBMW);
    }
}
