import java.util.HashMap;
import java.util.Map;

class ShoppingList {
    private Map<String, ItemDetails> items = new HashMap<>();

    public void addItem(String item, double cost, int quantity) {
        if (!items.containsKey(item)) {
            items.put(item, new ItemDetails(cost, quantity));
        } else {
            System.out.println(item + " is already in the list. Use updateQuantity or updateCost to change the details.");
        }
    }

    public void updateQuantity(String item, int quantity) {
        ItemDetails details = items.get(item);
        if (details != null) {
            details.quantity = quantity;
        } else {
            System.out.println("Item " + item + " is not in the list.");
        }
    }

    public void removeItem(String item) {
        if (items.remove(item) == null) {
            System.out.println(item + " is not in the list.");
        }
    }

    public void displayItems() {
        for (Map.Entry<String, ItemDetails> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": Cost - $" + entry.getValue().cost + ", Quantity - " + entry.getValue().quantity);
        }
    }


}
