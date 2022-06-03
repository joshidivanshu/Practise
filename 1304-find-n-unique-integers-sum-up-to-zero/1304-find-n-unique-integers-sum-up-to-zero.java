class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2 != 0)
        {
            arr[n/2] = 0;
            int i = 1;
            int l = 0;
            int h = n-1;
            while(l<h)
            {
                arr[l] = i;
                arr[h] = -i;
                l++;
                h--;
                i++;
            }
        }
        else
        {
            int h = n-1;
            int i = 1;
            arr[(n/2)-1] = i;
            arr[h] = -i;
            i++;
            h--;
            int l = 0;
            while(l<h)
            {
                arr[l] = i;
                arr[h] = -i;
                l++;
                h--;
                i++;
            }
        }
        return arr;
    }
}