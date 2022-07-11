class Solution {
    public int[] runningSum(int[] nums) {
        int prefixSum = 0;
        int n = nums.length;
        int res[] = new int[n];
        for(int i=0;i<n;i++)
        {
            prefixSum += nums[i];
            res[i] = prefixSum;
        }
        return res;
    }
}