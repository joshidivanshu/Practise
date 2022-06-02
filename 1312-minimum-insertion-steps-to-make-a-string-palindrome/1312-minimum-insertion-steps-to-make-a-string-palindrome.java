class Solution {
    public int lps(String s)
    {
        if(s.length() == 0)
            return 0;
        if(s.length() == 1)
            return 1;
        int n = s.length();
        StringBuilder s1 = new StringBuilder(s);
        s1 = s1.reverse();
        String s2 = new String(s1);
        int dp[][] = new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); 
            }
        }
        return dp[n][n];
    }
    public int minInsertions(String s) {
        int n = s.length();
        if(n == 0 || n == 1)
            return 0;
        int dist = lps(s);
        return n-dist;
    }
}