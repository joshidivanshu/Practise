class Solution {
    int res = 0;
    public int maxLength(List<String> arr) {
        res = 0;
        maxUtil(arr,0,"");
        return res;
    }
    public int uniqueChars(String s)
    {
        int arr[] = new int[256];
        for(int i=0;i<s.length();i++)
        {
            if(arr[s.charAt(i)] > 0)
                return -1;
            arr[s.charAt(i)]++;
        }
        return s.length();
    }
    public void maxUtil(List<String> arr,int index, String curr)
    {
        if(index == arr.size() && uniqueChars(curr) > res)
        {
            res = curr.length();
            return;
        }
        if(index == arr.size())
            return;
        
        maxUtil(arr,index+1,curr);
        maxUtil(arr,index+1,curr+arr.get(index));
    }
}