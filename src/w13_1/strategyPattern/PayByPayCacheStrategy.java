package w13_1.strategyPattern;

public class PayByPayCacheStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("pay by Cache");
    }
}
