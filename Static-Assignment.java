class InventoryItem {
    // Static variable shared across ALL InventoryItem objects
    static int totalItems = 0;

    // Instance variables - unique to each object
    String itemName;
    int quantity;

    // Constructor
    public InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        totalItems += quantity; // account for initial stock
    }

    // Static method to get the total number of items across all inventory
    public static int getTotalItems() {
        return totalItems;
    }

    // Adds a given amount to this item's quantity and updates the running total
    public void addToInventory(int amount) {
        quantity += amount;
        totalItems += amount;
    }

    // Removes a given amount from this item's quantity and updates the running total
    public void removeFromInventory(int amount) {
        if (amount > quantity) {
            System.out.println("Warning: cannot remove more than available quantity of " + itemName
                    + ". Removing all remaining stock instead.");
            amount = quantity;
        }
        quantity -= amount;
        totalItems -= amount;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create multiple inventory items
        InventoryItem laptops = new InventoryItem("Laptop", 50);
        InventoryItem mice = new InventoryItem("Mouse", 100);
        InventoryItem keyboards = new InventoryItem("Keyboard", 75);

        System.out.println("=== Initial Stock ===");
        System.out.println("Total items in stock: " + InventoryItem.getTotalItems());

        // Add items to inventory
        System.out.println("\n=== Adding Stock ===");
        laptops.addToInventory(20);
        System.out.println("Added 20 laptops. Total items in stock: " + InventoryItem.getTotalItems());

        keyboards.addToInventory(10);
        System.out.println("Added 10 keyboards. Total items in stock: " + InventoryItem.getTotalItems());

        // Remove items from inventory
        System.out.println("\n=== Removing Stock ===");
        mice.removeFromInventory(30);
        System.out.println("Removed 30 mice. Total items in stock: " + InventoryItem.getTotalItems());

        laptops.removeFromInventory(15);
        System.out.println("Removed 15 laptops. Total items in stock: " + InventoryItem.getTotalItems());

        // Final report
        System.out.println("\n=== Final Inventory ===");
        System.out.println(laptops.itemName + ": " + laptops.quantity);
        System.out.println(mice.itemName + ": " + mice.quantity);
        System.out.println(keyboards.itemName + ": " + keyboards.quantity);
        System.out.println("\nFinal total items in stock: " + InventoryItem.getTotalItems());
    }
}
