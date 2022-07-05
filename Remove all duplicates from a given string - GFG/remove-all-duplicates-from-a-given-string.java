// { Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        // code here
        int arr[] = new int[256];
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)]++;
        }
        String res = "";
        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)] != 0)
            {
                res += str.charAt(i);
                arr[str.charAt(i)] = 0;
            }
        }
        return res;

        
    }
}

