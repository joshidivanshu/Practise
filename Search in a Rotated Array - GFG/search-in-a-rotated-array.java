// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int arr[], int l, int h, int target)
    {
        // Complete this function
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[l] <= arr[mid])
            {
                if(arr[l] <= target && arr[mid] >= target)
                {
                    h = mid-1;
                }
                else
                {
                    l = mid+1;
                }
            }
            else
            {
                if(arr[mid] <= target && arr[h] >= target)
                {
                    l = mid+1;
                }
                else
                {
                    h = mid-1;
                }
            }
        }
        return -1;
    }
}