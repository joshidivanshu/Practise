class Solution {
    public int missingNumber(int[] arr) {
        // using bit manipulation 
        // int res = 0;
        // int n = nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     res = res^nums[i];   
        // }
        // for(int i=0;i<=n;i++)
        // {
        //     res = res^i;
        // }
        // return res;
        
        // using cycle sort
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
    public void swap(int arr[],int f,int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}