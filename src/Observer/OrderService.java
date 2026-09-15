package Observer;

import SimpleBuilder.Order;

import java.util.List;

public class OrderService {
    private  List<OrderObserver> listeners;
    public void createOrder(Order order){
        listeners.forEach(l->l.onCreateOrder(order));
    }
}
