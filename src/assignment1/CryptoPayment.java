package assignment1;

public class CryptoPayment implements PaymentStrategy {
    private String cryptoAddress;

    public CryptoPayment(String cryptoAddress) {
        this.cryptoAddress = cryptoAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount + " to address " + cryptoAddress);
    }
}