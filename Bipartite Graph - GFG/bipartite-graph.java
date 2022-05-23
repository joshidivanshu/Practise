// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}// } Driver Code Ends


class Solution
{
    boolean check(int[] colors,int val1,int val2)
    {
        if(colors[val1] == colors[val2])
            return false;
        return true;    
    }
    boolean fun(ArrayList<ArrayList<Integer>>adj, boolean[] visited, int[] colors,int s)
    {
        int v = adj.size();
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        visited[s] = true;
        colors[s] = 0;
        while(!q.isEmpty())
        {
            int u = q.poll();
            for(int x : adj.get(u))
            {
                if(!visited[x])
                {
                    visited[x] = true;
                    q.add(x);
                    if(colors[u] == 0)
                        colors[x] = 1;
                    else
                        colors[x] = 0;
                }
                else if(colors[x] != -1)
                {
                    if(!check(colors,u,x))
                        return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int v, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        boolean[] visited = new boolean[v];
        int[] colors = new int[v];
        Arrays.fill(colors, -1);
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                if(!fun(adj,visited,colors,i))
                    return false;
            }
        }
        return true;
    }
}