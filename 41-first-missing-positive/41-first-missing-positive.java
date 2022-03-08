class Solution {
    public void swap(int arr[],int f,int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i < n)
        {
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct])
            {
                swap(arr, i , correct);
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+" ");
        for(int j=0;j<n;j++)
        {
            if(arr[j]-1 != j)
                return j+1;
        }
        return n+1;
    }
}