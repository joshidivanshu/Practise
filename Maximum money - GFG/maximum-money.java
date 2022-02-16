// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String St[] = read.readLine().split(" ");
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);

            Solution ob = new Solution();
            System.out.println(ob.maximizeMoney(N,K));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int fun(int n,int k)
    {
        if(n <= 0)
            return 0;
        int res = fun(n-1,k);
        return Math.max(res,k+fun(n-2,k));
    }
    static int maximizeMoney(int n , int k) {
        // code here
        if(n <= 2)
            return k;
        int dp[] = new int[n];
        dp[0] = k;
        dp[1] = k;
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(dp[i-1],k+dp[i-2]);
        }
        return dp[n-1];
        
        
    }
}