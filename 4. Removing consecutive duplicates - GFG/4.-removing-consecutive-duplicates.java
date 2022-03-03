// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//taking the length of the string
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //taking the string
		   String str = br.readLine().trim();
		   
		   //calling removeConsecutiveDuplicates method of class solve
		   System.out.println(new Solution().removeConsecutiveDuplicates(str));
		}
	}
}// } Driver Code Ends




class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String s)
    {
        // Your code here
        Stack<Character> st = new Stack<Character>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty() && st.peek() != s.charAt(i))
            {
                st.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty())
        {
            res.append(st.pop());
        }
        res = res.reverse();
        return new String(res);
    }
}