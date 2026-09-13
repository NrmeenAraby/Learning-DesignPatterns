package Observer;

import Builder.Order;

public interface OrderObserver {
    void onCreateOrder(Order order);
}
