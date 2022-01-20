class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=1;i<n;i++)
        {
            int delta = heights[i]-heights[i-1];
            if(delta <= 0)
            {
                continue;
            }
            else
            {
                if(pq.size() < ladders)
                {
                    pq.add(delta);
                }
                else
                {
                    //here we optimize
                    int br = delta;
                    if(pq.size() > 0 && pq.peek() < delta)
                    {
                        br = pq.remove();
                        pq.add(delta);
                    }
                    if(bricks >= br)
                    {
                        bricks -= br;
                    }
                    else
                        return i-1;
                }
            }
        }
        return n-1;
        
    }
}