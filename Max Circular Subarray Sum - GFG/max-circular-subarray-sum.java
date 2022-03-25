// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int kadane(int arr[],int n)
    {
        int sum = 0;
        int res = arr[0];
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            res = Math.max(res, sum);
            if(sum < 0)
                sum = 0;
        }
        return res;
    }
    static int circularSubarraySum(int arr[], int n) {
        
        // Your code here
        int lsum = kadane(arr,n);
        if(lsum < 0)
            return lsum;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            arr[i] = -arr[i];
        }
        int min_sum = kadane(arr,n);
        int csum = sum+min_sum;
        return Math.max(lsum,csum);
        
    }
    
}

