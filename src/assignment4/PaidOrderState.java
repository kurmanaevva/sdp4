package assignment4;

public class PaidOrderState implements State {
    private Order order;

    public PaidOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is being shipped.");
        order.setState(order.getShippedState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order cannot be delivered until it's shipped.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Paid order cannot be cancelled.");
    }
}