// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    public static void swap(int arr[], int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
    public static void reverse(int arr[], int l, int h)
    {
        while(l<h)
        {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
    static List<Integer> nextPermutation(int n, int arr[]){
        // code here
        List<Integer> res = new ArrayList<Integer>();
        int i = n-2;
        while(i >=0 && arr[i] >= arr[i+1])
            i--;
        if(i >= 0)
        {
            int j = n-1;
            while(j>=0 && arr[j] <= arr[i])
                j--;
            swap(arr, i ,j);    
        }
        reverse(arr,i+1,n-1);
        for(int k=0;k<n;k++)
            res.add(arr[k]);
        return res;    
        
    }
}