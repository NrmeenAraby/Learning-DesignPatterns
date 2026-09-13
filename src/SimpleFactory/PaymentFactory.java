package SimpleFactory;

public class PaymentFactory {
    public static Payment create(String type){
        return switch(type){
            case "Card"-> new CreditCardPayment();
            case "Bank" -> new BankTransferPayment();
            case"PayPal"->new PayPalPayment();
            default -> throw new IllegalArgumentException(type);
        };
    }
}
