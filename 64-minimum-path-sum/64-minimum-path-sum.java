class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][m] = Integer.MAX_VALUE;
        }
        for(int i=0;i<=m;i++)
        {
            dp[n][i] = Integer.MAX_VALUE;
        }
        dp[n-1][m] = 0;
        dp[n][m-1] = 0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                dp[i][j] = grid[i][j]+Math.min(dp[i+1][j], dp[i][j+1]);
            }
        }
        return dp[0][0];
    }
}