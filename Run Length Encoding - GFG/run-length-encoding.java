// { Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          int n = str.length();
          StringBuilder sb = new StringBuilder();
          int i = 0;
          while(i<n)
          {
              int cnt = 1;
              sb.append(str.charAt(i));
              int j = i+1;
              while(j<n && str.charAt(j) == str.charAt(j-1))
              {
                  cnt++;
                  j++;
              }
              sb.append(cnt);
              i = j;
          }
          return new String(sb);
	}
	
 }