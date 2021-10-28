package w13_1.factoryMethodePattern;

import w13_1.factoryMethodePattern.creator.ButtonCreator;
import w13_1.factoryMethodePattern.creator.HtmlButtonCreator;
import w13_1.factoryMethodePattern.creator.WindowsButtonCreator;
import w13_1.factoryMethodePattern.product.Button;

public class Application {
    public static void main(String[] args) {
        ButtonCreator buttonCreator;
        Button button;

        // Configuration
        if (System.getProperty("OS").equals("Windows"))
            buttonCreator = new WindowsButtonCreator();
        else
            buttonCreator = new HtmlButtonCreator();

        button = buttonCreator.createButton();

        button.click();
    }
}
