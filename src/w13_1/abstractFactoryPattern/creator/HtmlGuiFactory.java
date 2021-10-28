package w13_1.abstractFactoryPattern.creator;

import w13_1.abstractFactoryPattern.product.*;

public class HtmlGuiFactory extends GuiFactory{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new HtmlCheckBox();
    }
}
