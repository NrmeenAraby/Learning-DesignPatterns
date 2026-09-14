package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.buttons.MacOsButton;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.checkboxes.MacOsCheckbox;

//Concrete factory
public class MacOsFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
