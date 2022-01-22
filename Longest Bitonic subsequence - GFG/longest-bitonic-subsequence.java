// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        // Code here
        int n = nums.length;
        int lis1[] = new int[n];
        int lis2[] = new int[n];
        Arrays.fill(lis1,1);
        Arrays.fill(lis2,1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j] < nums[i])
                    lis1[i] = Math.max(lis1[i],lis1[j]+1);
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-1;j>=i;j--)
            {
                if(nums[j] < nums[i])
                    lis2[i] = Math.max(lis2[i], lis2[j]+1);
            }
        }
        int res = 1;
        for(int i=0;i<n;i++)
        {
            res = Math.max(res, lis1[i]+lis2[i]-1);
        }
        return res;
    }
}