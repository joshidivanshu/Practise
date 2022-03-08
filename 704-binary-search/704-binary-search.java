class Solution {
    public int fun(int nums[],int l,int h,int val)
    {
        if(l > h)
            return -1;
        int mid = l+(h-l)/2;
        if(nums[mid] == val)
            return mid;
        else if(nums[mid] < val)
        {
            return fun(nums,mid+1,h,val);
        }
        else
            return fun(nums,l,mid-1,val);
    }
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                l = mid+1;
            else
                h = mid-1;
        }
        return -1;
    }
}