package Question_6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderProcessor processor = new OrderProcessor();

        System.out.print("Enter Available Stock: ");
        int stock = sc.nextInt();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Wallet Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter 6-digit Pincode: ");
        int pincode = sc.nextInt();

        try {
            processor.processOrder(stock, price, balance, pincode);
        } catch (InventoryException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (PaymentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (ShippingException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        sc.close();
    }
}
