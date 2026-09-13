import Builder.Order;
import SimpleFactory.Payment;
import SimpleFactory.PaymentFactory;

public class Main {
    public static void main(String[] args) {
        //Factory
        Payment payment;
        payment= PaymentFactory.create("Card");

        //Builder
        Order order= new Order.Builder()  //this new keyword creates the Builder that get modified by the builder methods-
                .customerName("Nrmeen")
                .address("dufhufv")
                .build();        //-while the order itself is created via the build method as u know

    }
}