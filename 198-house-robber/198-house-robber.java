class Solution {
    public int fun(int[] nums,int n)
    {
        if(n<= 0)
            return 0;
        return Math.max(nums[n-1]+fun(nums,n-2),fun(nums,n-1));
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        if(n == 1)
            return(nums[0]);
        if(n == 2)
            return Math.max(nums[0],nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}