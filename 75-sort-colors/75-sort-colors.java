class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int h = n-1;
        int l = 0;
        int mid = 0;
        while(mid<=h)
        {
            if(nums[mid] == 0)
            {
                int temp = nums[l];
                nums[l] = nums[mid];
                nums[mid] = temp;
                l++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp = nums[h];
                nums[h] = nums[mid];
                nums[mid] = temp;
                h--;
            }
                
        }
    }
}