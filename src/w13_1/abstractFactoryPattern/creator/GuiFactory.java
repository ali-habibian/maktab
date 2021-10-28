package w13_1.abstractFactoryPattern.creator;

import w13_1.abstractFactoryPattern.product.Button;
import w13_1.abstractFactoryPattern.product.CheckBox;

public abstract class GuiFactory {
   public abstract Button createButton();
   public abstract CheckBox createCheckBox();
}
