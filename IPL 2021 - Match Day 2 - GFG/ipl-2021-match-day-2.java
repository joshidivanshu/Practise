// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String args[]) {
        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total number of elements
            int n = sc.nextInt();

            // taking size of subArrays
            int k = sc.nextInt();

            // Declaring and Intializing an array of size n
            int arr[] = new int[n];

            // adding all the elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Calling the method max_of_subarrays of class solve
            // and storing the result in an ArrayList
            ArrayList<Integer> res = new Solution().max_of_subarrays(arr, n, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        Deque<Integer> dq = new LinkedList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);    
        }
        for(int i=k;i<n;i++)
        {
            res.add(arr[dq.peek()]);
            while(!dq.isEmpty() && dq.peek() <= i-k)
                dq.removeFirst();
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);    
        }
        res.add(arr[dq.peek()]);
        return res;
    }
}