package w13_1.abstractFactoryPattern.product;

public class HtmlCheckBox implements CheckBox{
    @Override
    public void tick() {
        System.out.println("html check box");
    }
}
