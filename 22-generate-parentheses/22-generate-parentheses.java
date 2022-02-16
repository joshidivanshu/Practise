class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backtrack(res,"",0,0,n);
        return res;
    }
    public void backtrack(List<String> res, String curr,int open,int close,int max)
    {
        //base case
        if(curr.length() == max*2)
        {
            res.add(curr);
            return;
        }
        if(open < max)
            backtrack(res,curr+"(",open+1,close,max);
        if(close < open)
            backtrack(res,curr+")",open,close+1,max);
    }
    
}