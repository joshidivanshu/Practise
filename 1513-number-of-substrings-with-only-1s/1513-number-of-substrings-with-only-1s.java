class Solution {
    public int numSub(String s) {
        long res = 0;
        long cnt = 0;
        int mod = 1000000007;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == '1')
                cnt++;
            else
            {
                res = (((cnt)*(cnt+1)/2)+res);
                cnt = 0;
            }
        }
        if(cnt != 0)
            res = (((cnt)*(cnt+1)/2)+res);
        return (int)(res%mod);
    }
}