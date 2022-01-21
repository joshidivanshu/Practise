class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int start = 0;
        Set<Character> hs = new HashSet<Character>();
        for(int i=0;i<n;i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                res = Math.max(res, hs.size());
                while(hs.contains(s.charAt(i)))
                {
                    hs.remove(s.charAt(start++));
                }
                hs.add(s.charAt(i));
            }
            else
                hs.add(s.charAt(i));
        }
        res = Math.max(res, hs.size());
        return res;
        
    }
}