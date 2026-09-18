import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.factories.GuiFactory;
import AbstractFactory.factories.MacOsFactory;
import AbstractFactory.factories.WindowsFactory;
import Bridge.devices.Device;
import Bridge.devices.Radio;
import Bridge.devices.Tv;
import Bridge.remotes.AdvancedRemote;
import Bridge.remotes.BasicRemote;
import Bridge.remotes.Remote;
import Builder.builders.CarBuilder;
import Builder.builders.ManualBuilder;
import Builder.cars.Car;
import Builder.cars.Manual;
import Builder.director.Director;
import Facade.facade.VideoConversionFacade;
import Proxy.client.YouTubeDownloader;
import Proxy.proxy.YouTubeCacheProxy;
import Proxy.some_cool_media_library.ThirdPartyYouTubeClass;

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
//        Director director=new Director();
//
//        CarBuilder carBuilder=new CarBuilder();
//        director.constructSportsCar(carBuilder);
//        Car car=carBuilder.getResult();
//        System.out.println("Car built:\n" + car.getCarType());
//
//        ManualBuilder manualBuilder=new ManualBuilder();
//        director.constructSportsCar(manualBuilder);
//        Manual carManual=manualBuilder.getResult();
//        System.out.println("\nCar manual built:\n" + carManual.print());
//
//        //debugging the resetting
//        director.randomToTestReset(manualBuilder);
//        Manual carManual2=manualBuilder.getResult();
//        System.out.println("\nCar manual built:\n" + carManual2.print());

        //Facade
//        VideoConversionFacade facadeConverter=new VideoConversionFacade();
//        facadeConverter.convertVideo("youtubevideo.ogg", "mp4");

        //Bridge
        //client code deals with the abstraction layer, but also creates the objects of both(implementation and abstraction hierarchies)
//        Tv tvDevice=new Tv();
//        Remote basic=new BasicRemote(tvDevice);
//        basic.volumeUp();
//        Remote advanced=new AdvancedRemote(tvDevice);
//        advanced.volumeUp();
//
//        Radio radio=new Radio();
//        AdvancedRemote advancedRemote=new AdvancedRemote(radio);
//        advancedRemote.mute();

        //Proxy
        //client code inside YouTubeDownloader, here we clarify proxy effect
        YouTubeDownloader naiveDownloader =new YouTubeDownloader(new ThirdPartyYouTubeClass()); //using the real service direct
        YouTubeDownloader smartDownloader =new YouTubeDownloader(new YouTubeCacheProxy(new ThirdPartyYouTubeClass()));

        long naiveTime = test(naiveDownloader);
        long smartTime = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naiveTime - smartTime) + "ms");

    }
    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}