class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
            return 0;
        
        int dp[]=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            dp[i]=amount+1;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]>i)
                    continue;
                dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
            }
        }
        if(dp[amount]>amount)
            return -1;
        return dp[amount];

    }
}