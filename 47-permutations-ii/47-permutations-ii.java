class Solution {
   public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(res, new ArrayList<Integer>(), new boolean[nums.length], nums);
        return res;
    }
    public static void backtrack(List<List<Integer>> res, List<Integer> path, boolean[] visited, int[] nums)
    {
        if(path.size() == nums.length)
        {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i] || i > 0 && nums[i] == nums[i-1] && !visited[i-1])
                continue;
            visited[i] = true;
            path.add(nums[i]);
            backtrack(res,path,visited,nums);
            visited[i] = false;
            path.remove(path.size()-1);
        }
    }
}