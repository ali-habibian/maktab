package w4;

public class Stock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {7,6,4,3,1};
//        int[] prices = {7, 5, 5, 3, 16, 1, 8};
//        int[] prices = {};
//        int[] prices = {1};

        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) { // Loop all prices except last price
            for (int j = i + 1; j < prices.length; j++) { // Loop all prices after ith price
                int profit = prices[j] - prices[i];
                if (profit > maxProfit)
                    maxProfit = profit;
            }
        }

        System.out.println(maxProfit);
    }
}
