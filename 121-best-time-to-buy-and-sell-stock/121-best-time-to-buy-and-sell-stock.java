class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        int bought = prices[0];
        for(int i=1;i<n;i++)
        {
            if(prices[i] > bought)
            {
                ans = Math.max(ans, prices[i]-bought);
            }
            else
            {
                bought = prices[i];
            }
        }
        return ans;
    }
}