class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        Arrays.sort(nums);
        backtrack(nums,res,path,0);
        return res;
    }
    public void backtrack(int[] nums,List<List<Integer>> res, List<Integer> path, int s)
    {
        res.add(new ArrayList<Integer>(path));
        for(int i=s;i<nums.length;i++)
        {
            if(i>s && nums[i] == nums[i-1])
                continue;
            path.add(nums[i]);
            backtrack(nums,res,path,i+1);
            path.remove(path.size()-1);
        }
        return;
    }
}