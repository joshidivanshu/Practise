// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int arr[], int n)
    {
        // code here
        int xor = 0;
        for(int i=0;i<n;i++)
        {
            xor = xor^arr[i];
        }
        int rmsb = xor&(~(xor-1));
        int x = 0;
        int y = 0;
        for(int i=0;i<n;i++)
        {
            if((arr[i] & rmsb) >= 1)
            {
                x = x^arr[i];
            }
            else
            {
                y = y^arr[i];
            }
            
        }
        int res[] = new int[2];
        if(x > y)
        {
            res[0] = x;
            res[1] = y;
        }
        else
        {
            res[0] = y;
            res[1] = x;
        }
        return res;
        
    }
}