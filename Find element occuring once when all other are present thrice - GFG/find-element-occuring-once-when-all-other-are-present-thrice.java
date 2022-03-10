// { Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.singleElement(arr,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int singleElement(int[] arr , int n) {
        // code here
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i], 1);
            }
            else
            {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet())
        {
            if(e.getValue() == 1)
                return e.getKey();
        }
        return -1;
    }
}