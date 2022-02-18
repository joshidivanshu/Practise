class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        List<Integer> path = new ArrayList<Integer>();
        backtrack(res,path,nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> path, int[] nums)
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
            backtrack(res,path,nums);
            path.remove(path.size()-1);
        }
    }
}