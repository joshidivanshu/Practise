// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    
	    //Taking input using Scanner class
	    Scanner sc=new Scanner(System.in);
	    
	    //taking count of all the testcases
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
	        //taking count of total number of elements
	        int n=sc.nextInt();
	        
	        //Declaring and Initializing an ArrayDeque
	        ArrayDeque<Integer> deq = new ArrayDeque<>();
	        
	        //adding elements at the last of ArrayDeque
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            deq.addLast(x);
	            
	        }
	        
	        
	        //Calling method printDeque 
	        printDeque(deq);
	        
	        
	    }
		
	}
	
	
 // } Driver Code Ends
//User function Template for Java


//Function to traverse the Deque and print the elements of it.
public static void printDeque(ArrayDeque<Integer> deq)
{
   //Your code here
   for(int x : deq)
   {
    System.out.print(x+" ");
   }
   System.out.println();
}

// { Driver Code Starts.


}  // } Driver Code Ends