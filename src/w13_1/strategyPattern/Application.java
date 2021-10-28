package w13_1.strategyPattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        switch (input) {
            case 0:
                context.setPaymentStrategy(new NoPayStrategy());
                break;
            case 1:
                context.setPaymentStrategy(new PayByPayCacheStrategy());
                break;
            case 2:
                context.setPaymentStrategy(new PayByPayCreditStrategy());
                break;
            case 3:
                context.setPaymentStrategy(new PayByPayPallStrtegy());
                break;
            default:
        }

        context.doPayment(10000);
    }
}
