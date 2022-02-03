class MySort implements Comparator<String>
{
    public int compare(String s1, String s2)
    {
        // returning 1 will interchange their positions
        if(s1.length() > s2.length())
            return 1;
        // -1 will keep it as it is    
        else if(s1.length() < s2.length())
            return -1;
        // compare to returns 1 if s1 < s2 & further accordingly    
        return s1.compareTo(s2);    
    }
}
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // define the custom comparator for priority queue.
        PriorityQueue<String> pq = new PriorityQueue<>(new MySort());
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            pq.add(nums[i]);
            if(pq.size() > k)
                pq.poll();
        }
        return pq.peek();
        
    }
}