package w13_1.strategyPattern;

public class NoPayStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("no pay");
    }
}
