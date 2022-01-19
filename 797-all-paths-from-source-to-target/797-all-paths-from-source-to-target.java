class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = graph.length;
        List<Integer> path = new ArrayList<Integer>();
        dfs(graph,res,path,0);
        return res;
    }
    public static void dfs(int[][] graph,List<List<Integer>> res,List<Integer> path,int s)
    {
        if(s == graph.length-1)
        {
            path.add(s);
            res.add(new ArrayList<Integer>(path));
            return;
        }
        path.add(s);
        for(int l: graph[s])
        {
            dfs(graph,res,path,l);
            path.remove(path.size()-1);
        }
        return;
    }
}