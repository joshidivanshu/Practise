class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int l = 0;
        int h = 1;
        while(l<n && h<n)
        {
            if(arr[l] == 0 && arr[h] != 0)
            {
                arr[l] = arr[h];
                arr[h] = 0;
                l++;
                h++;
            }
            else if(arr[l] == 0 && arr[h] == 0)
                h++; 
            else if(arr[l] != 0)
            {
                l++;
                h++;
            }
        }
        
    }
}