class Solution {
    public int[] singleNumber(int[] nums) {
        int res = 0;
        int res1[] = new int[2];
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            res = res^nums[i];
        }
        int sn = res & (~(res - 1));
        int r1 = 0;
        int r2 = 0;
        for(int i=0;i<n;i++)
        {
            if((nums[i] & sn) != 0)
                r1 = r1^nums[i];
            else
                r2 = r2^nums[i];
        }
        res1[0] = r1;
        res1[1] = r2;
        return res1;
        
    }
}