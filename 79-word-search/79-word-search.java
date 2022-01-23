class Solution {
    boolean[][] visited;
    public int check(int i,int j,char[][] board)
    {
        if(i == -1 || i == board.length || j == -1 || j == board[0].length)
            return -1;
        return 0;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        visited = new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(dfs(board,word,0,i,j))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,String word,int ind,int i,int j)
    {
        if(check(i,j,board) == -1 || visited[i][j] || word.charAt(ind) != board[i][j])
            return false;
        visited[i][j] = true;
        if(ind == word.length()-1)
            return true;
        ind++;
        if(dfs(board,word,ind,i+1,j) ||
          (dfs(board,word,ind,i-1,j))||
          (dfs(board,word,ind,i,j+1))||
          (dfs(board,word,ind,i,j-1)))
            return true;
        visited[i][j] = false;
        return false;
    }
}