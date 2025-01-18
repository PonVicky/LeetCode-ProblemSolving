class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], profit = 0;
        for(int i=1;i<prices.length;i++){
            int cash = prices[i] - min;
            min = Math.min(min, prices[i]);
            profit = Math.max(profit,cash);
        }

        return profit;
    }
}