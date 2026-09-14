package AbstractFactory.buttons;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacOS Button painting...");
    }
}
