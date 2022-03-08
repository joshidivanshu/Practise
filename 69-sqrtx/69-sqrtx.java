class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
            return x;
        long start =1,end = x,ans =0;
        while(start<=end)
        {
            long mid = (start+end)/2;
            if(mid*mid==x)
                return (int)(mid);
            if(mid*mid<x)
            {
                start = (mid+1);
                ans = mid;
            }
            else
                end = mid-1;
        }
        return (int)(ans);
    }
}