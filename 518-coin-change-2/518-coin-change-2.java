class Solution {
    public int fun(int coins[],int amount,int n)
    {
        if(amount == 0)
            return 1;
        if(n == 0)
            return 0;
        int res = 0;
        if(coins[n-1] <= amount)
            res = fun(coins,amount-coins[n-1],n);
        res += fun(coins,amount,n-1);
        return res;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[amount+1][n+1];
        for(int i=0;i<=n;i++)
        {
            dp[0][i] = 1;
        }
        for(int i=1;i<=amount;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(coins[j-1] <= i)
                {
                    dp[i][j] = dp[i-coins[j-1]][j];
                }
                dp[i][j] += dp[i][j-1];
            }
        }
        return dp[amount][n];
    }
}