import Builder.Order;
import FactoryMethod.Factory.Dialog;
import FactoryMethod.Factory.HtmlDialog;
import FactoryMethod.Factory.WindowsDialog;
import SimpleFactory.Payment;
import SimpleFactory.PaymentFactory;

public class Main {
    public static void main(String[] args) {
        //Simple Factory
        Payment payment;
        payment= PaymentFactory.create("Card");

        //Builder
        Order order= new Order.Builder()  //this new keyword creates the Builder that get modified by the builder methods-
                .customerName("Nrmeen")
                .address("dufhufv")
                .build();        //-while the order itself is created via the build method as u know

        //Factory Method
        Dialog winDialog=new WindowsDialog();
        winDialog.renderWindow();
        Dialog htmlDialog = new HtmlDialog();
        htmlDialog.renderWindow();
    }
}