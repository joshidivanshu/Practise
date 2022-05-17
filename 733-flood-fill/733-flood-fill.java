class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        dfs(image,sr,sc,color,newColor);
        return image;
    }
    void dfs(int[][] image,int row,int column,int color,int newColor)
    {
        if(row < 0 || row >= image.length || column < 0 || column >= image[0].length)
            return;
        if(image[row][column] != color || color == newColor)
            return;
        if(image[row][column] == color)
            image[row][column] = newColor;
        dfs(image, row+1 , column,color, newColor);
        dfs(image, row , column+1 ,color, newColor);
        dfs(image , row-1 , column,color, newColor);
        dfs(image , row , column-1 ,color, newColor);
        return;
    }
}