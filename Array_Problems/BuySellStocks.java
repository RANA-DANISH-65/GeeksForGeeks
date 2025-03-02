public class BuySellStocks {
    public int getMaxProfit(int[] prices) {
        int minPrice = Integer.MIN_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
