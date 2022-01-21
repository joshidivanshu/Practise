class Solution {
    public int lcs(String s1,String s2,int n,int m)
    {
        if(n == 0)
            return 0;
        if(m == 0)
            return 0;
        if(s1.charAt(n-1) == s2.charAt(m-1))
            return 1+lcs(s1,s2,n-1,m-1);
        return Math.max(lcs(s1,s2,n,m-1),lcs(s1,s2,n-1,m));
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}