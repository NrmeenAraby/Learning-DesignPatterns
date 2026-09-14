package AbstractFactory.checkboxes;

public class MacOsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("MacOS checkbox painting...");
    }
}
