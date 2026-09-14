import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.factories.GuiFactory;
import AbstractFactory.factories.MacOsFactory;
import AbstractFactory.factories.WindowsFactory;
import Builder.Order;
import FactoryMethod.Factory.Dialog;
import FactoryMethod.Factory.HtmlDialog;
import FactoryMethod.Factory.WindowsDialog;
import SimpleFactory.Payment;
import SimpleFactory.PaymentFactory;

public class Main {
    public static void main(String[] args) {
        //Simple Factory
//        Payment payment;
//        payment= PaymentFactory.create("Card");

        //Builder
//        Order order= new Order.Builder()  //this new keyword creates the Builder that get modified by the builder methods-
//                .customerName("Nrmeen")
//                .address("dufhufv")
//                .build();        //-while the order itself is created via the build method as u know

        //Factory Method
//        Dialog winDialog=new WindowsDialog();
//        winDialog.renderWindow();
//        Dialog htmlDialog = new HtmlDialog();
//        htmlDialog.renderWindow();

        // Abstract Factory
        GuiFactory factory1=new MacOsFactory();
        GuiFactory factory2 =new WindowsFactory();
        /* the configuration done without any action from the client, so the client now can create whatever button or
         checkbox they need without knowing about factory creating
        */
        Button button=factory1.createButton();
        Checkbox checkbox=factory1.createCheckbox();
        button.paint();
        checkbox.paint();
    }
}