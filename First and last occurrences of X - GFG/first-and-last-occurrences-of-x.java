// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            


// } Driver Code Ends


//User function Template for Java
class Solution{
    public int first(int arr[],int n,int x)
    {
        int l = 0;
        int h = n-1;
        int res = -1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(arr[mid] == x)
            {
                res = mid;
                h = mid-1;
            }
            else if(arr[mid] < x)
            {
                l = mid+1;
            }
            else
                h = mid-1;
        }
        return res;
    }
    public int last(int arr[],int n,int x)
    {
        int l = 0;
        int h = n-1;
        int res = -1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(arr[mid] == x)
            {
                res = mid;
                l = mid+1;
            }
            else if(arr[mid] < x)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }
        return res;
    }
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        int f1 = first(arr,n,x);
        if(f1 != -1)
            res.add(f1);
        res.add(last(arr,n,x));
        return res;
    }
}
