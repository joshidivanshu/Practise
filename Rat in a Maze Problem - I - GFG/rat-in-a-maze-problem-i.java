// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> list=new ArrayList<>();
        String bf = "";
        
        backtrack(m,n,list,0,0,bf);
        return list;    
    }
    public static void backtrack(int[][] m,int n,ArrayList<String> list,int i,int j,String bf)
    {
        if(i<0 || i>=n || j<0 || j>=n || m[i][j]==0)
        {
            //bf.remove()
            //We have taken wrong step, go back;
            return;
        }
        if(i==n-1 && j==n-1)
        {
            list.add(bf+"");
            //bf.deleteCharAt(bf.length()-1);
            return;
        }
        
        //Now we have four options;
        m[i][j]=0; //making it visited;
        
        backtrack(m,n,list,i+1,j,bf+"D");
        backtrack(m,n,list,i,j-1,bf+"L");
        backtrack(m,n,list,i,j+1,bf+"R");
        backtrack(m,n,list,i-1,j,bf+"U");
        
        m[i][j]=1;
    }
}