package w13_1.factoryMethodePattern.creator;

import w13_1.factoryMethodePattern.product.Button;
import w13_1.factoryMethodePattern.product.WindowsButton;

public class WindowsButtonCreator extends ButtonCreator{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
