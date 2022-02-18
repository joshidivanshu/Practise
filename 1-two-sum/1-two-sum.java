class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                res[0] = i;
                res[1] = hm.get(target-nums[i]);
                return res;
            }
            hm.put(nums[i],i);
        }
        return res;
    }
}