package w13_1.abstractFactoryPattern.product;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void tick() {
        System.out.println("Window check box");
    }
}
