import java.util.HashMap;
import java.util.Map;

class ItemDetails {
    double cost;
    int quantity;

    public ItemDetails(double cost, int quantity) {
        this.cost = cost;
        this.quantity = quantity;
    }
}

public class GroceryListManager {
    private HashMap<String, ItemDetails> groceryList = new HashMap<>();

    public void addItemWithQuantity(String item, double cost, int quantity) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, new ItemDetails(cost, quantity));
        } else {
            System.out.println(item + " is already in the list. Use updateQuantity to change the quantity.");
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            ItemDetails details = groceryList.get(item);
            details.quantity = newQuantity;
        } else {
            System.out.println("Item " + item + " is not in the list.");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (ItemDetails details : groceryList.values()) {
            totalCost += details.cost * details.quantity;
        }
        return totalCost;
    }

    public void displayAvailableItems() {
        for (Map.Entry<String, ItemDetails> entry : groceryList.entrySet()) {
            if (entry.getValue().quantity > 0) {
                System.out.println(entry.getKey() + ": $" + entry.getValue().cost + ", Quantity: " + entry.getValue().quantity);
            }
        }
    }

    public void displayList() {
        for (Map.Entry<String, ItemDetails> item : groceryList.entrySet()) {
            System.out.println(item.getKey() + ": $" + item.getValue().cost + ", Quantity: " + item.getValue().quantity);
        }
    }

    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();
        list.addItemWithQuantity("Milk", 2.99, 2);
        list.addItemWithQuantity("Eggs", 3.49, 12);
        list.addItemWithQuantity("Bread", 2.50, 1);
        list.displayList();
        System.out.println("Total Cost: $" + list.calculateTotalCost());
        list.updateQuantity("Eggs", 6);
        list.displayAvailableItems();
    }
}
