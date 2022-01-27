class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 1 || n == 0)
            return s;
        if(n == 2)
        {
            if(s.charAt(0) == s.charAt(1))
                return s;
            return Character.toString(s.charAt(0));
        }
        int dp[][] = new int[n+1][n+1];
        //dp[i][j] represents string of length i ending at index j
        for(int i=0;i<=n;i++)
        {
            dp[0][i] = 1;
        }
        for(int i=0;i<=n;i++)
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
                    dp[i][j] = 0;
            }
        }
        int len = 1;
        int endingAt = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(dp[i][j] == 1 && i>len)
                {
                    len = i;
                    endingAt = j;
                }
            }
            
        }
        return s.substring(endingAt-len,endingAt);
    }
}