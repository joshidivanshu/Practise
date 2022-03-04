class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> res = new ArrayList<Integer>();
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            int correct = arr[i]-1;
            if(correct != n && arr[i] != arr[correct])
            {
                swap(arr, i , correct);
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(j != arr[j]-1)
                res.add(j+1);
        }
        return res;
        
    }
    public void swap(int[] arr,int f,int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}