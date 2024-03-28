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
    private Map<String, ShoppingList> shoppingLists = new HashMap<>();

    public void createShoppingList(String listName) {
        if (!shoppingLists.containsKey(listName)) {
            shoppingLists.put(listName, new ShoppingList());
        } else {
            System.out.println("Shopping list " + listName + " already exists.");
        }
    }

    public void addItemToList(String listName, String item, double cost, int quantity) {
        ShoppingList list = shoppingLists.get(listName);
        if (list != null) {
            list.addItem(item, cost, quantity);
        } else {
            System.out.println("Shopping list " + listName + " does not exist.");
        }
    }

    public void updateItemQuantity(String listName, String item, int quantity) {
        ShoppingList list = shoppingLists.get(listName);
        if (list != null) {
            list.updateQuantity(item, quantity);
        } else {
            System.out.println("Shopping list " + listName + " does not exist.");
        }
    }

    public void removeItemFromList(String listName, String item) {
        ShoppingList list = shoppingLists.get(listName);
        if (list != null) {
            list.removeItem(item);
        } else {
            System.out.println("Shopping list " + listName + " does not exist.");
        }
    }

    public void displayShoppingList(String listName) {
        ShoppingList list = shoppingLists.get(listName);
        if (list != null) {
            System.out.println("Items in " + listName + " shopping list:");
            list.displayItems();
        } else {
            System.out.println("Shopping list " + listName + " does not exist.");
        }
    }
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.createShoppingList("Weekly Grocery");
        manager.addItemToList("Weekly Grocery", "Milk", 2.99, 2);
        manager.addItemToList("Weekly Grocery", "Bread", 2.50, 1);
        manager.displayShoppingList("Weekly Grocery");
    }
}
