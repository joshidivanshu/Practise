class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        List<Integer> path = new ArrayList<Integer>();
        backtrack(nums,res,path,0);
        return res;
    }
    
    public static void backtrack(int[] nums,List<List<Integer>> res, List<Integer> path, int s)
    {
        res.add(new ArrayList<Integer>(path));
        for(int i=s;i<nums.length;i++)
        {
            path.add(nums[i]);
            backtrack(nums,res,path,i+1);
            path.remove(path.size()-1);
        }
        return;
    }
}