class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0)
            return res;
        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        int n = digits.length();
        String str = new String("");
        dfs(digits,n,res,0,str,hm);
        return res;
    }
    public void dfs(String digits, int n, List<String> res, int ind, String str,Map<Character,String> hm)
    {
        if(ind == n)
        {
            res.add(str);
            return;
        }
        String s = hm.get(digits.charAt(ind));
        for(int i=0;i<s.length();i++)
        {
            str += s.charAt(i);
            dfs(digits,n,res,ind+1,str,hm);
            str = str.substring(0,str.length()-1);
        }
    }
}