class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> set = new ArrayList<Integer>();
        dfs(res,set,nums,0);
        return res;
    }
    public void dfs(List<List<Integer>> res, List<Integer> set,int[] nums,int ind)
    {
        res.add(new ArrayList<Integer>(set));
        for(int i=ind;i<nums.length;i++)
        {
            if(i > ind && nums[i] == nums[i-1])
                continue;
            set.add(nums[i]);
            dfs(res,set,nums,i+1);
            set.remove(set.size()-1);
        }
    }
}