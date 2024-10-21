package assignment4;

public class DeliveredOrderState implements State {
    private Order order;

    public DeliveredOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already delivered and cannot be paid again.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Delivered order cannot be cancelled.");
    }
}