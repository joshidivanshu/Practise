class Solution {
    boolean check(int[] colors, int val1,int val2)
    {
        if(colors[val1] == colors[val2])
            return false;
        return true;
    }
    boolean isBipartiteUtil(List<List<Integer>> adj, boolean[] visited, int[] colors, int s)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        colors[s] = 0;
        while(!q.isEmpty())
        {
            int u = q.poll();
            for(int v: adj.get(u))
            {
                if(!visited[v])
                {
                    q.add(v);
                    visited[v] = true;
                    if(colors[u] == 0)
                        colors[v] = 1;
                    else
                        colors[v] = 0;
                }
                else
                {
                    if(!check(colors,u,v))
                        return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        List<List<Integer>> adj = new ArrayList<List<Integer>>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<v;i++)
        {
            for(int x : graph[i])
            {
                adj.get(i).add(x);
            }
        }
        boolean[] visited = new boolean[v];
        int color[] = new int[v];
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                if(!isBipartiteUtil(adj, visited, color, i))
                    return false;
            }
        }
        return true;
    }
}