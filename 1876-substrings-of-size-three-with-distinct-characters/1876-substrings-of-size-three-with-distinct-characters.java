class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        int cnt = 0;
        if(n >= 3)
        {
        for(int i=0;i<=2;i++)
        {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        if(hm.size() == 3)
            cnt++;
        for(int i=3;i<n;i++)
        {
            if(hm.containsKey(s.charAt(i-3)))
            {
                int val = hm.get(s.charAt(i-3));
                if(val > 1)
                    hm.put(s.charAt(i-3),val-1);
                else if(val == 1)
                    hm.remove(s.charAt(i-3));
            }
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
            if(hm.size() == 3)
                cnt++;
                
        }
        return cnt;    
        }
        return 0;
        
    }
}