class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1)
            return;
        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1])
            i--;
        if(i >= 0)
        {
            int j = n-1;
            while(j >=0 && nums[j] <= nums[i])
                j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
        }
        int l =i+1;
        int h = n-1;
        while(l<h)
        {
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
        return;
    }
    public String getPermutation(int n, int k) {
        int arr[] = new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1] = i;       
        }
        for(int i=0;i<k-1;i++)
        {
            nextPermutation(arr);
        }
        String res = "";
        for(int i=0;i<n;i++)
        {
            res += arr[i];
        }
        return res;
    }
}