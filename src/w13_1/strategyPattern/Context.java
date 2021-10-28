package w13_1.strategyPattern;

public class Context {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void doPayment(double amount){
        paymentStrategy.pay(amount);
    }
}
