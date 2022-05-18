class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 1)
                {
                    res = Math.max(res, dfs(grid,i,j));
                }
            }
        }
        return res;
    }
    int dfs(int[][] grid, int i,int j)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return 0;
        if(grid[i][j] == 0)
            return 0;
        int res = 0;
        if(grid[i][j] == 1)
        {
            res++;
            grid[i][j] = 0;
        }
        
        res += dfs(grid,i+1,j);
        res += dfs(grid,i,j+1);
        res += dfs(grid,i-1,j);
        res += dfs(grid,i,j-1);
        
        return res;
    }
}