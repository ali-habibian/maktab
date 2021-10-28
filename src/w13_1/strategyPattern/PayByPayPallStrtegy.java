package w13_1.strategyPattern;

public class PayByPayPallStrtegy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("pay by paypal");
    }
}
