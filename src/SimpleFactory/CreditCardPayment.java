package SimpleFactory;

public class CreditCardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("CreditCardPayment");
    }
}
