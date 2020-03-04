class Solution121 {
    public int maxProfit(int[] prices) {
        int profit=0;
        for (int i=0;i<prices.length-1;i++){
            for (int j=i+1;j<prices.length;j++){
                profit = Math.max(prices[j] - prices[i], profit);
            }
        }
        return profit;
    }
}


public class LC121 {

}
