class Solution {
    public void swap(int[] nums, int f, int s)
    {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
    public int missingNumber(int[] arr) {
        /*int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            res = res^nums[i];
        }
        for(int i=0;i<=n;i++)
        {
            res = res^i;
        }
        return res;*/
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            int correct = arr[i];
            if(correct != n && arr[i] !=  arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(j != arr[j])
                return j;
        }
        return n;
    }
}