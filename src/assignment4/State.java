package assignment4;

public interface State {
    void payOrder();
    void shipOrder();
    void deliverOrder();
    void cancelOrder();
}
