class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        List<Integer> path = new ArrayList<Integer>();
        boolean[] visited = new boolean[n];
        dfs(res,path,nums,visited);
        return res;
    }
    public void dfs(List<List<Integer>> res, List<Integer> path, int[] nums, boolean[] visited)
    {
        if(path.size() == nums.length)
        {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i])
                continue;
            visited[i] = true;
            path.add(nums[i]);
            dfs(res,path,nums,visited);
            path.remove(path.size()-1);
            visited[i] = false;
        }
    }
}