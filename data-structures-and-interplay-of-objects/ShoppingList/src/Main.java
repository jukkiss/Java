public class Main {
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.createShoppingList("Backyard BBQ");
        manager.createShoppingList("Weekend Camping");

        manager.addItemToList("Backyard BBQ", "Steak", 10.99, 5);
        manager.addItemToList("Backyard BBQ", "Charcoal", 5.99, 2);

        manager.addItemToList("Weekend Camping", "Tent", 120.00, 1);
        manager.addItemToList("Weekend Camping", "Sleeping Bag", 40.00, 2);

        manager.displayShoppingList("Backyard BBQ");
        manager.displayShoppingList("Weekend Camping");
    }
}
