package FactoryMethod.buttons;

public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("Rendering HTML button....");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Clicking HTML button....");
    }
}
