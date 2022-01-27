class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int n = arr.length;
        int res[] = new int[2];
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(target-arr[i]))
            {
                res[0] = hm.get(target-arr[i]);
                res[1] = i;
                return res;
            }
            hm.put(arr[i],i);
        }
        return res;
    }
}