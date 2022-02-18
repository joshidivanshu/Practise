class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        backtrack(res,path,target,candidates,0);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> path,int target,int[] candidates,int ind)
    {
        if(target == 0)
        {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        if(target < 0)
        {
            return;
        }
        for(int i=ind;i<candidates.length;i++)
        {
            path.add(candidates[i]);
            backtrack(res,path,target-candidates[i],candidates,i);
            path.remove(path.size()-1);
        }
        
    }
}