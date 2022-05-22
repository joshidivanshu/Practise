// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> list = ob.kLargest(arr, n, k);
            for(int i = 0; i<list.size(); i++)
                System.out.print(list.get(i) + " ");
            System.out.println();
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++)
        {
            if(pq.size() <k)
            {
                pq.add(arr[i]);
            }
            else
            {
                if(pq.peek() < arr[i])
                {
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>(k);
        while(!pq.isEmpty())
        {
            res.add(pq.poll());
        }
        int l = 0;
        int h = k-1;
        while(l<h)
        {
            int temp = res.get(l);
            res.set(l, res.get(h));
            res.set(h, temp);
            l++;
            h--;
        }
        return res;
    }
}