// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
   int minEle;
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> aux = new Stack<Integer>();

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	if(!aux.isEmpty())
	{
	return(aux.peek());
	}
	return -1;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	   if(s.isEmpty())
	   return -1;
	   else
	   {
	       if(!aux.isEmpty())
	       {
	       if(s.peek()==aux.peek())
	       {
	           aux.pop();
	       }
	       int z = s.pop();
	       return z;
	       }
	   }
	   return -1;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	  s.push(x);
	  if(aux.isEmpty())
	  {
	      aux.push(x);
	  }
	  else
	  {
	      if(aux.peek() >= s.peek())
	      {
	          aux.push(x);
	      }
	  }
    }	
}

