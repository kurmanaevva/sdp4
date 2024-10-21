package assignment1;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Constructor to set initial payment strategy
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to change payment strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Process payment using current strategy
    public void checkout(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("No payment method selected.");
        }
        paymentStrategy.processPayment(amount);
    }
}