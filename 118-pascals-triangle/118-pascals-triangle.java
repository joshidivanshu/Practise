class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            path.add(0,1);
            for(int j=1;j<path.size()-1;j++)
            {
                path.set(j,path.get(j)+path.get(j+1));
            }
            res.add(new ArrayList<Integer>(path));
        }
        return res;
    }
}