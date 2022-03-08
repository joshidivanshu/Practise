// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String str = read.readLine().trim(); 
            Solution obj = new Solution();
            int ans = obj.palindromeSubStrs(str);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    int palindromeSubStrs(String s) { 
        // code here 
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
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
        Set<String> hs = new HashSet<String>();
        for(int i=0;i<n;i++)
        {
            hs.add(Character.toString(s.charAt(i)));
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(dp[i][j] == 1)
                {
                    hs.add(s.substring(j-i,j));
                }
            }
        }
        return hs.size();
    }
} 