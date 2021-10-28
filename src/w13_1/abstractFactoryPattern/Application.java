package w13_1.abstractFactoryPattern;

import w13_1.abstractFactoryPattern.creator.GuiFactory;
import w13_1.abstractFactoryPattern.creator.HtmlGuiFactory;
import w13_1.abstractFactoryPattern.creator.WindowsGuiFactory;

public class Application {
    public static void main(String[] args) {
        GuiFactory guiFactory;

        if (System.getProperty("OS").equals("Windows"))
            guiFactory = new WindowsGuiFactory();
        else
            guiFactory = new HtmlGuiFactory();

        guiFactory.createButton().click();
        guiFactory.createCheckBox().tick();
    }


}
