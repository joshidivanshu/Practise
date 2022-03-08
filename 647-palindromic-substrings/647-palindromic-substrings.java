class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        //dp[i][j] denotes if substring of size i ending at j is palindromic or not.
        for(int i=0;i<=n;i++)
        {
            dp[0][i] = 1;
        }
        for(int i=1;i<=n;i++)
        {
            dp[1][i] = 1;
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(s.charAt(j-i) == s.charAt(j-1))
                {
                    dp[i][j] = dp[i-2][j-1];
                }
                else
                {
                    dp[i][j] = 0;
                }
            }
        }
        int cnt = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(dp[i][j] == 1)
                    cnt++;
            }
        }
        return cnt;
    }
}