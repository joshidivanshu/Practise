class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = arr.length;
        Arrays.sort(arr);
        int min_res = Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            min_res = Math.min(min_res, arr[i]-arr[i-1]);
        }
        // System.out.println(min_res);
        for(int i=1;i<n;i++)
        {
            if(arr[i]-arr[i-1] == min_res)
            {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                res.add(new ArrayList<Integer>(temp));
            }
        }
        return res;
    }
}