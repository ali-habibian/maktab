package w13_1.abstractFactoryPattern.product;

public class HtmlButton implements Button{
    @Override
    public void click() {
        System.out.println("html button");
    }
}
