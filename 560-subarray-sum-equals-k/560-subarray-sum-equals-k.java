class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            int curr_sum = 0;
            for(int j=i;j<n;j++)
            {
                curr_sum += nums[j];
                if(curr_sum == k)
                    cnt++;
            }
        }
        return cnt;
        
    }
}