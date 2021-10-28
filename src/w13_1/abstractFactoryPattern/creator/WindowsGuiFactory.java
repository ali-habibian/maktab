package w13_1.abstractFactoryPattern.creator;

import w13_1.abstractFactoryPattern.product.Button;
import w13_1.abstractFactoryPattern.product.CheckBox;
import w13_1.abstractFactoryPattern.product.WindowsButton;
import w13_1.abstractFactoryPattern.product.WindowsCheckBox;

public class WindowsGuiFactory extends GuiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
