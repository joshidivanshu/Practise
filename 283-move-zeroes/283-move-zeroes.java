class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int cnt = n-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
            {
                res[cnt] = 0;
                cnt--;
            }
        }
        cnt = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
            {
                res[cnt] = nums[i];
                cnt++;
            }
        }
        for(int i=0;i<n;i++)
        {
            nums[i] = res[i];
        }
        return;
    }
}