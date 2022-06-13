class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0;i<n-2;i++)
        {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1]))
            {
                int l = i+1;
                int h = n-1;
                while(l<h)
                {
                    if(nums[i]+nums[l]+nums[h] == 0)
                    {
                        res.add(Arrays.asList(nums[i],nums[l],nums[h]));
                        while(l<h && nums[l] == nums[l+1])
                            l++;
                        while(h>l && nums[h-1] == nums[h])
                            h--;
                        l++;
                        h--;
                    }
                    else if(nums[i]+nums[l]+nums[h] < 0)
                    {
                        l++;
                    }
                    else
                    {
                        h--;
                    }
                }
            }
        }
        return res;
    }
}