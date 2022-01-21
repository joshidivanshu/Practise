class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        for(int i=0;i<n;i++)
        {
            Set<Character> hs = new HashSet<Character>();
            hs.add(s.charAt(i));
            res = Math.max(res,hs.size());
            for(int j=i+1;j<n;j++)
            {
                if(!hs.contains(s.charAt(j)))
                    hs.add(s.charAt(j));
                else
                {
                    break;
                }
            }
            res = Math.max(res,hs.size());
        }
        return res;
        
    }
}