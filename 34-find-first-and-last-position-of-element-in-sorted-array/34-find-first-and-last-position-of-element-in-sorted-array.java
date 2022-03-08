class Solution {
    public int firstOcc(int arr[],int target)
    {
        int l = 0;
        int h = arr.length-1;
        int res = -1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(arr[mid] == target)
            {
                res = mid;
                h = mid-1;
            }
            else if(arr[mid] < target)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }
        return res;
        
    }
    public int lastOcc(int arr[],int target)
    {
        int l = 0;
        int h = arr.length-1;
        int res = -1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(arr[mid] == target)
            {
                res = mid;
                l = mid+1;
            }
            else if(arr[mid] < target)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = firstOcc(nums, target);
        res[1] = lastOcc(nums, target);
        return res;
    }
}