class Solution {
    public int maxProfit(int[] prices) {
        int price=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<price) price=prices[i];
            else
            {
                int profit=prices[i]-price;
                if(maxprofit<profit) maxprofit=profit;
            }
        }
        return maxprofit;
    }
}
