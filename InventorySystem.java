package Cognizant;
import java.util.HashMap;
import java.util.Scanner;

public class InventorySystem {
    static HashMap<String, Product> inventory = new HashMap<>();

    public static void addProduct(String id, String name, int qty, double price) {
        Product p = new Product(id, name, qty, price);
        inventory.put(id, p);
        System.out.println("Product added.");
    }

    public static void updateProduct(String id, int newQty, double newPrice) {
        Product p = inventory.get(id);1
        if (p != null) {
            p.quantity = newQty;
            p.price = newPrice;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void deleteProduct(String id) {
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add  2. Update  3. Delete  4. View  5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Qty: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    addProduct(id, name, qty, price);
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    String uid = sc.nextLine();
                    System.out.print("New Qty: ");
                    int newQty = sc.nextInt();
                    System.out.print("New Price: ");
                    double newPrice = sc.nextDouble();
                    updateProduct(uid, newQty, newPrice);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    String did = sc.nextLine();
                    deleteProduct(did);
                    break;

                case 4:
                    displayInventory();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}

