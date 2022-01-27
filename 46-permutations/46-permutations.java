class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        backtrack(nums,path,res);
        return res;
    }
    public void backtrack(int[] nums,List<Integer> path,List<List<Integer>> res)
    {
        if(path.size() == nums.length)
        {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(path.contains(nums[i]))
                continue;
            path.add(nums[i]);
            backtrack(nums,path,res);
            path.remove(path.size()-1);
        }
    }
}