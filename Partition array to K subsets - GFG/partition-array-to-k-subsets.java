// { Driver Code Starts
import java.util.*;

class Partition_Arr_To_K_Subsets
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();
			Solution g = new Solution();
			if(g.isKPartitionPossible(a,n,k)==true)
				System.out.println(1);
			else 
				System.out.println(0);
			
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete this method */

class Solution
{
    public boolean isKPartitionPossible(int a[], int n, int k)
    {
	// Your code here
	int sum = 0;
	Integer[] arr = new Integer[n];
	int i = 0;
	for(int z : a)
	{
	    arr[i++] = z;
	    sum += z;
	}
	if(sum % k != 0)
	    return false;
	Arrays.sort(arr, Collections.reverseOrder());
	return backtrack(arr,k,new boolean[arr.length],sum/k,0,0);    
    }
    public boolean backtrack(Integer[] arr,int k,boolean[] seen,int targetSum,int idx,int subsetSum)
    {
        if(k == 0)
            return true;
        if(targetSum == subsetSum)
        {
            return backtrack(arr,k-1,seen,targetSum,0,0);
        }
        for(int i=idx;i<arr.length;i++)
        {
            if(seen[i] || subsetSum+arr[i] > targetSum)
                continue;
            seen[i] = true;
            if(backtrack(arr,k,seen,targetSum,i+1,subsetSum+arr[i]))
                return true;
            seen[i] = false;
        }
        return false;
    }
}
