package w13_1.factoryMethodePattern.product;

public class HtmlButton implements Button{
    @Override
    public void paint() {
        System.out.println("Html Button painted");
    }

    @Override
    public void click() {
        System.out.println("Html Button clicked");
    }
}
