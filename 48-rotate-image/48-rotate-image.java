class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int l = 0;
        int h = m-1;
        while(l<h)
        {
            for(int i=0;i<n;i++)
            {
                int temp = mat[i][l];
                mat[i][l] = mat[i][h];
                mat[i][h] = temp;
                
            }
            l++;
            h--;
        }
        return;
    }
}