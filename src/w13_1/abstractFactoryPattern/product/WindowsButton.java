package w13_1.abstractFactoryPattern.product;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Window button");
    }
}
