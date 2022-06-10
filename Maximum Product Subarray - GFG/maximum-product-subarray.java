// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        
        long max_ending_here = arr[0];
        long min_ending_here = arr[0];
        long max_so_far = arr[0];
        
        for(int i=1;i<n;i++)
        {
            long temp = Math.max(Math.max(arr[i], arr[i]*max_ending_here), arr[i]*min_ending_here);
            min_ending_here = Math.min(Math.min(arr[i], arr[i]*max_ending_here),arr[i]*min_ending_here);
            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}