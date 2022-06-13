class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<Integer> hs = new HashSet<>();
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(nums[i]))
            {
                hs.add(nums[i]);
                HashSet<Integer> hs1 = new HashSet<>();
                for(int j=i+1;j<n;j++)
                {
                    if(nums[j]-nums[i] == k && !hs1.contains(nums[j]))
                    {
                        cnt++;
                        hs1.add(nums[j]);
                    }
                }
            }
        }
        return cnt;
    }
}