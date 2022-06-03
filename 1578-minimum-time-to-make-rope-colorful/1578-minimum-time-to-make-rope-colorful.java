class Solution {
    public int minCost(String colors, int[] neededTime) {
        char prev_char = '*';
        int ans = 0;
        int costp = 0;
        int n = colors.length();
        for(int i=0;i<n;i++)
        {
            if(colors.charAt(i) == prev_char)
            {
                if(costp < neededTime[i])
                {
                    ans += costp;
                    costp = neededTime[i];
                }
                else
                {
                    ans += neededTime[i];
                }
            }
            else
            {
                prev_char = colors.charAt(i);
                costp = neededTime[i];
            }
        }
        return ans;
    }
}