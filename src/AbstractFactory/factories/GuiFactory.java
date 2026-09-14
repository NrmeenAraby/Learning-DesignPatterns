package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.Checkbox;

// abstract factory
public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
