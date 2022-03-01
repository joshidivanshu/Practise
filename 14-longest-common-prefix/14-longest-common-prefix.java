class Solution {
    public String lcputil(String s1, String s2)
    {
        int n1 = s1.length();
        int n2 = s2.length();
        String res ="";
        int i = 0 , j = 0;
        while(i<n1 && j<n2)
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                res += s1.charAt(i);
                i++;
                j++;
            }
            else
            {
                break;
            }
        }
        return res;
        
    }
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 1)
            return strs[0];
        String prefix = strs[0];
        for(int i=1;i<n;i++)
        {
            prefix = lcputil(prefix,strs[i]);
        }
        return prefix;
    }
}