package Question_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private Map<Integer, Product> catalog;

    private List<Product> cart;

    private List<Order> orderHistory;
    private int orderCounter = 1001;

    public ShoppingCart() {
        catalog = new HashMap<>();
        cart = new ArrayList<>();
        orderHistory = new ArrayList<>();
    }

    public void addProductToCatalog(Product p) {
        catalog.put(p.getId(), p);
    }

    public void displayCatalog() {
        System.out.println("\nProduct Catalog");
        for (Map.Entry<Integer, Product> entry : catalog.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void addToCart(int productId) {
        if (catalog.containsKey(productId)) {
            Product p = catalog.get(productId);
            cart.add(p);
            System.out.println("Added to Cart: " + p.getName());
        } else {
            System.out.println("Product ID not found in catalog!");
        }
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty! Nothing to checkout.");
            return;
        }

        double total = 0;
        for (Product p : cart) {
            total += p.getPrice();
        }

        Order order = new Order(orderCounter++, new ArrayList<>(cart), total);
        orderHistory.add(order);
        cart.clear();

        System.out.println("Checkout successful! Order placed: " + order);
    }

    public void displayOrderHistory() {
        System.out.println("\nOrder History");
        if (orderHistory.isEmpty()) {
            System.out.println("No past orders found.");
        } else {
            for (Order o : orderHistory) {
                System.out.println(o);
            }
        }
    }
}
