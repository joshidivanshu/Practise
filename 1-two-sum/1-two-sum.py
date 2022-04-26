class Solution {
    public int[] twoSum(int[] arr, int target) {
        int res[] = new int[2];
        int n = arr.length;
        Map<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(target-arr[i]))
            {
                res[0] = i;
                res[1] = hm.get(target-arr[i]);
                return res;
            }
            else
            {
                hm.put(arr[i], i);
            }
        }
        return res;
    }
}