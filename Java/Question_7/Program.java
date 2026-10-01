package Question_7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart system = new ShoppingCart();

        System.out.print("Enter number of products to add to Store Catalog: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Product " + (i + 1) + " Details:");
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Product Name: ");
            String name = sc.next();
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();

            system.addProductToCatalog(new Product(id, name, price));
        }

        int choice;
        do {
            System.out.println("\nSHOPPING CART MENU");
            System.out.println("1. View Catalog");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Checkout");
            System.out.println("4. View Order History");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    system.displayCatalog();
                    break;
                case 2:
                    System.out.print("Enter Product ID to add: ");
                    int pid = sc.nextInt();
                    system.addToCart(pid);
                    break;
                case 3:
                    system.checkout();
                    break;
                case 4:
                    system.displayOrderHistory();
                    break;
                case 0:
                    System.out.println("Exiting Shopping Cart application.");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 0);

        sc.close();
    }
}
