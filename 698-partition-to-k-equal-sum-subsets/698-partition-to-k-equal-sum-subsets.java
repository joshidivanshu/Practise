class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        Integer[] arr = new Integer[n];
        int i = 0;
        for(int z : nums)
        {
            arr[i++] = z;
            sum += z;
        }
        if(sum % k != 0)
            return false;
        Arrays.sort(arr,Collections.reverseOrder());
        return backtrack(arr, k , new boolean[arr.length], sum/k,0,0);
        
    }
    boolean backtrack(Integer[] arr,int k,boolean[] seen,int targetSum,int idx,int subsetSum)
    {
        if(k == 0)
            return true;
        if(targetSum == subsetSum)
            return backtrack(arr,k-1,seen,targetSum,0,0);
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