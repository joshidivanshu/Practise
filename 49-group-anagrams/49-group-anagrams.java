class Solution {
    public String genKey(String s)
    {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        int n = strs.length;
        if( n == 0)
            return res;
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String key = genKey(strs[i]);
            if(!hm.containsKey(key))
            {
                List<String> temp = new ArrayList<String>();
                temp.add(strs[i]);
                hm.put(key,temp);
            }
            else
            {
                hm.get(key).add(strs[i]);
            }
        }
        for(Map.Entry<String,List<String>> e : hm.entrySet())
        {
            res.add(e.getValue());
        }
        return res;
    }
}