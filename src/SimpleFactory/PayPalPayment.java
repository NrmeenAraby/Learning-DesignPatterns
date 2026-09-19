package SimpleFactory;

public class PayPalPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("PayPalPayment");
    }
}
