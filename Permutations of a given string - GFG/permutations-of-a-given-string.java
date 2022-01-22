// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String s) {
        // Code here
        List<String> res = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        Set<Character> hs = new HashSet<Character>();
        dfs(s,res,sb,hs);
        Collections.sort(res);
        return res;
    }
    public void dfs(String s,List<String> res, StringBuilder sb,Set<Character> hs)
    {
        if(sb.length() == s.length())
        {
            res.add(new String(sb));
            return;
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(hs.contains(s.charAt(i)))
                continue;
            sb.append(s.charAt(i));
            hs.add(s.charAt(i));
            dfs(s,res,sb,hs);
            hs.remove(s.charAt(i));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}