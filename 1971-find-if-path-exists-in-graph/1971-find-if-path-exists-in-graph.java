class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<List<Integer>>();
        boolean[] visited = new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            adj.add(i,new ArrayList<Integer>());
        }
        for(int[] e : edges)
        {   
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        return dfs(adj,source,destination,visited);
        
    }
    public boolean dfs(List<List<Integer>> adj,int s,int d,boolean[] visited)
    {
        if(s == d)
            return true;
        visited[s] = true;
        for(int l : adj.get(s))
        {
            if(!visited[l])
            {
                boolean check = dfs(adj,l,d,visited);
                if(check)
                    return true;
            }
        }
        return false;
    }
    

}