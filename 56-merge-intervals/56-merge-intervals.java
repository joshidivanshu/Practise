class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int res = 0;
        for(int i=1;i<n;i++)
        {
            if(intervals[res][1] >= intervals[i][0])
            {
                intervals[res][0] = Math.min(intervals[res][0],intervals[i][0]);
                intervals[res][1] = Math.max(intervals[res][1],intervals[i][1]);
            }
            else
            {
                res++;
                intervals[res][0] = intervals[i][0];
                intervals[res][1] = intervals[i][1];
            }
        }
        return Arrays.copyOf(intervals,res+1);
    }
}