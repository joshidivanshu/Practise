// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean isValidIPv4Token(String token) {
	if(token.startsWith("0") && token.length()>1) return false;
	try {
		int parsedInt = Integer.parseInt(token);
		if(parsedInt<0 || parsedInt>255) return false;
	} catch(NumberFormatException nfe) {
		return false;
	}
	return true;
}
    public boolean isValid(String ip) {
        // Write your code here
        if(ip.length()<7) return false;
    	if(ip.charAt(0)=='.') return false;
    	if(ip.charAt(ip.length()-1)=='.') return false;
        String[] tokens = ip.split("\\.");
    	if(tokens.length!=4) return false;
    	for(String token:tokens) {
    		if(!isValidIPv4Token(token)) return false;
    	}
    	return true;
    }
}