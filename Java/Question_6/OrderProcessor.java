package Question_6;

public class OrderProcessor {

    public void processOrder(int stock, double price, double balance, int pincode) 
            throws InventoryException, PaymentException, ShippingException {

        if (stock <= 0) {
            throw new InventoryException("Inventory Error: Item is out of stock!");
        }

        if (balance < price) {
            throw new PaymentException("Payment Error: Insufficient account balance!");
        }

        if (pincode < 100000 || pincode > 999999) {
            throw new ShippingException("Shipping Error: Invalid/Unserviceable Pincode!");
        }

        System.out.println("SUCCESS: Order placed successfully!");
    }
}
