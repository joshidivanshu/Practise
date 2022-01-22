class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int lis[] = new int[n];
        Arrays.fill(lis,1);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                    lis[i] = Math.max(lis[i],lis[j]+1);
            }
        }
        int res = 1;
        for(int i=1;i<n;i++)
        {
            res = Math.max(res,lis[i]);
        }
        return res;
    }
}