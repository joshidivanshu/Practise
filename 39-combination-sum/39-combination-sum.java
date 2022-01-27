class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        backtrack(candidates,target,path,res,0);
        return res;
    }
    public void backtrack(int[] candidates,int target,List<Integer> path,List<List<Integer>> res,int s)
    {
        if(target == 0)
        {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        if(target < 0)
            return;
        for(int i=s;i<candidates.length;i++)
        {
            if(candidates[i] <= target)
            {
                path.add(candidates[i]);
                backtrack(candidates,target-candidates[i],path,res,i);
                path.remove(path.size()-1);
            }
        }
    }
}