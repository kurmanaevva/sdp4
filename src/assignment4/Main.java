package assignment4;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Initial State: New
        System.out.println("Placing a new order...");
        order.payOrder();

        System.out.println("\nShipping the order...");
        order.shipOrder();

        System.out.println("\nDelivering the order...");
        order.deliverOrder();

        System.out.println("\nTrying to cancel the delivered order...");
        order.cancelOrder();
    }
}