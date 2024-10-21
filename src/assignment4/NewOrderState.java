package assignment4;

public class NewOrderState implements State {
    private Order order;

    public NewOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order has been paid.");
        order.setState(order.getPaidState());
    }

    @Override
    public void shipOrder() {
        System.out.println("Order cannot be shipped until it's paid.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order cannot be delivered until it's paid and shipped.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
        order.setState(order.getCancelledState());
    }
}