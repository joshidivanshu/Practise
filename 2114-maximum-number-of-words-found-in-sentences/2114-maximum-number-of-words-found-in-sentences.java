class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            String[] temp = sentences[i].split(" ");
            res = Math.max(res, temp.length);
        }
        return res;
    }
}