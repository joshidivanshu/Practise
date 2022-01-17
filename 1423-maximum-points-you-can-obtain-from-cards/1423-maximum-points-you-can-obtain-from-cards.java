class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i=0;i<cardPoints.length;i++)
        {
            sum += cardPoints[i];
        }
        int len = cardPoints.length-k;
        int min = 0;
        int curr_sum = 0;
        for(int i=0;i<len;i++)
        {
            curr_sum += cardPoints[i];
        }
        int min_res = curr_sum;
        for(int i=len;i<cardPoints.length;i++)
        {
            curr_sum += cardPoints[i]-cardPoints[i-len];
            min_res = Math.min(curr_sum, min_res);
        }
        return sum-min_res;
        
    }
}