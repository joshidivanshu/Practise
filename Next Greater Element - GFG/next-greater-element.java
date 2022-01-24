// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> st = new Stack<Long>();
        long[] res = new long[n];
        st.push(arr[n-1]);
        int cnt = 0;
        res[cnt++] = -1;
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek() <= arr[i])
            {
                st.pop();
            }
            long val = st.isEmpty() ? -1 : st.peek();
            res[cnt++] = val;
            st.push(arr[i]);
        }
        int l = 0;
        int h = n-1;
        while(l<h)
        {
            long temp = res[l];
            res[l] = res[h];
            res[h] = temp;
            l++;
            h--;
        }
        return res;
        
    } 
}