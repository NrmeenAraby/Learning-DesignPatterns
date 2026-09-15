package Observer;

import SimpleBuilder.Order;

public interface OrderObserver {
    void onCreateOrder(Order order);
}
