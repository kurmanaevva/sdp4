package assignment1;

public class Main {
    public static void main(String[] args) {
        // Initialize the shopping cart with CreditCardPayment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe", "12/25");
        ShoppingCart cart = new ShoppingCart(creditCardPayment);

        // Process a payment using credit card
        cart.checkout(250.00);

        // Change the payment method to PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(150.00);

        // Change the payment method to Crypto
        PaymentStrategy cryptoPayment = new CryptoPayment("cryptoAddressXYZ123");
        cart.setPaymentStrategy(cryptoPayment);
        cart.checkout(500.00);
    }
}