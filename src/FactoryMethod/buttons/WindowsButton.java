package FactoryMethod.buttons;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering windows button....");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Clicking windows button....");
    }
}
