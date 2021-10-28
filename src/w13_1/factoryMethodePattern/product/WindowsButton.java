package w13_1.factoryMethodePattern.product;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Windows Button painted");
    }

    @Override
    public void click() {
        System.out.println("Windows Button clicked");
    }
}
