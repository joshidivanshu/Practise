// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> res = new ArrayList<String>();
        backtrack(res,"",0,0,n);
        return res;
    }
    public static void backtrack(List<String> res,String curr,int open,int close,int max)
    {
        if(curr.length() == max*2)
        {
            res.add(curr);
            return;
        }
        if(open < max)
            backtrack(res,curr+"(",open+1,close,max);
        if(close < open)
            backtrack(res,curr+")",open,close+1,max);
    }
}