package Question_7;

import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;
    private double totalAmount;

    public Order(int orderId, List<Product> products, double totalAmount) {
        this.orderId = orderId;
        this.products = products;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order [OrderId=" + orderId + ", Products=" + products + ", TotalAmount=" + totalAmount + "]";
    }
}
