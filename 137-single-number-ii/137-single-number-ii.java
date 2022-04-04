class Solution {
    public int singleNumber(int[] arr) {
        int res = 0;
        int x;
        int n = arr.length;
        for(int i=0;i<32;i++)
        {
            x = 1<<i;
            int cnt = 0;
            for(int j=0;j<n;j++)
            {
                if((arr[j] & x) != 0)
                {
                    cnt++;
                }
            }
            if(cnt%3 != 0)
            {
                res |= x;
            }
        }
        return res;
    }
}