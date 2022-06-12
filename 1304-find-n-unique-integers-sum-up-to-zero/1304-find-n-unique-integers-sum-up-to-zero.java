class Solution {
    public int[] sumZero(int n) {
        int res[] = new int[n];
        if(n%2 != 0)
        {
            res[n/2] = 0;
            int l = 0;
            int h = n-1;
            int i = 1;
            while(l<h)
            {
                res[l] = i;
                res[h] = -i;
                l++;
                h--;
                i++;
            }
        }
        else
        {
            res[(n/2)-1] = 1;
            res[n-1] = -1;
            int l = 0;
            int h = n-2;
            int i = 2;
            while(l<h)
            {
                res[l] = i;
                res[h] = -i;
                l++;
                h--;
                i++;
            }
        }
        return res;
    }
}