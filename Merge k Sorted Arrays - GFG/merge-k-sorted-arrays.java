// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Triplet implements Comparable<Triplet>
{
    int val;
    int apos;
    int vpos;
    public Triplet(int val,int apos,int vpos)
    {
        this.val = val;
        this.apos = apos;
        this.vpos = vpos;
    }
    public int compareTo(Triplet t1)
    {
        if(val <= t1.val)
            return -1;
        return 1;
    }
}
class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<Integer>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            pq.add(new Triplet(arr[i][0],i,0));
        }
        while(!pq.isEmpty())
        {
            Triplet curr = pq.poll();
            res.add(curr.val);
            int apos = curr.apos;
            int vpos = curr.vpos;
            if(vpos+1 < arr[apos].length)
            {
                pq.add(new Triplet(arr[apos][vpos+1],apos,vpos+1));
            }
        }
        return res;
        
        
    }
}