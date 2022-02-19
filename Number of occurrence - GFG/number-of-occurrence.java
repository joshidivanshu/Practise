// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    public int focc(int arr[],int l ,int h ,int x)
    {
        if(l > h)
            return -1;
        int mid = l+(h-l)/2;
        if(arr[mid] == x && (mid == 0 || arr[mid-1] != x))
            return mid;
        else if(arr[mid] < x)
            return focc(arr,mid+1,h,x);
        else
            return focc(arr,l,mid-1,x);
        
    }
    public int locc(int arr[],int l,int h,int x)
    {
        if(l > h)
            return -1;
        int mid = l+(h-l)/2;
        if(arr[mid] == x && (mid == arr.length-1 || arr[mid+1] != x))
            return mid;
        else if(arr[mid] <= x)
            return locc(arr,mid+1,h,x);
        else
            return locc(arr,l,mid-1,x);
    }
    int count(int[] arr, int n, int x) {
        // code here
        int f = focc(arr,0,n-1,x);
        int l = locc(arr,0,n-1,x);
        if(f == -1 || l == -1)
            return 0;
        return l-f+1;    
    }
}