import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.factories.GuiFactory;
import AbstractFactory.factories.MacOsFactory;
import AbstractFactory.factories.WindowsFactory;
import Builder.builders.CarBuilder;
import Builder.builders.ManualBuilder;
import Builder.cars.Car;
import Builder.cars.Manual;
import Builder.director.Director;

public class Main {
    public static void main(String[] args) {
        //Simple Factory
//        Payment payment;
//        payment= PaymentFactory.create("Card");

        //Simple Builder
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
//        GuiFactory factory1=new MacOsFactory();
//        GuiFactory factory2 =new WindowsFactory();
//        /* the configuration done without any action from the client, so the client now can create whatever button or
//         checkbox they need without knowing about factory creating
//        */
//        Button button=factory1.createButton();
//        Checkbox checkbox=factory1.createCheckbox();
//        button.paint();
//        checkbox.paint();

         //Builder
        Director director=new Director();

        CarBuilder carBuilder=new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car=carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        ManualBuilder manualBuilder=new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual=manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}