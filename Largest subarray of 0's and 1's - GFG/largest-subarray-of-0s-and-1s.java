// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}
// } Driver Code Ends




class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int n)
    {
        // Your code here
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
                arr[i] = -1;
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int res = 0;
        int pre_sum = 0;
        for(int i=0;i<n;i++)
        {
            pre_sum += arr[i];
            if(pre_sum == 0)
            {
                res = Math.max(res,i+1);
            }
            if(hm.containsKey(pre_sum))
            {
                res = Math.max(res, i-hm.get(pre_sum));
            }
            else
            {
                hm.put(pre_sum, i);
            }
            
        }
        return res;
    }
}
