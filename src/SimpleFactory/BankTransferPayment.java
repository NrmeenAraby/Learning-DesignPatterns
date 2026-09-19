package SimpleFactory;

public class BankTransferPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("BankTransferPayment");
    }
}
