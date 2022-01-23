class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Set<List<Integer>> hs = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int l = i+1;
            int h = n-1;
            while(l<h)
            {
                if(nums[l]+nums[h]+nums[i] == 0)
                {
                    List<Integer> arr = new ArrayList<Integer>();
                    arr.add(nums[l]);
                    arr.add(nums[h]);
                    arr.add(nums[i]);
                    hs.add(new ArrayList<Integer>(arr));
                    l++;
                    h--;
                }
                else if(nums[l]+nums[h]+nums[i] < 0)
                {
                    l++;
                }
                else
                {
                    h--;
                }
            }
        }
        for(List<Integer> temp : hs)
        {
            res.add(new ArrayList<Integer>(temp));
        }
        return res;
        
    }
}