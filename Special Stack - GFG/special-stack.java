// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    Stack<Integer> st = new Stack<Integer>();
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    if(st.isEmpty())
	    {
	        st.push(a);
	    }
	    else if(st.peek() >= a)
	    {
	        st.push(a);
	    }
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(!s.isEmpty())
            {
                if(s.peek() == st.peek())
                {
                    s.pop();
                    return st.pop();
                }
                else
                {
                    return s.pop();
                }
            }
            return -1;
	    }
	public int min(Stack<Integer> s)
        {
           //add code here.
           if(!st.isEmpty())
                return st.peek();
           return -1;    
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size() == n)
                return true;
            return false;    
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.size() == 0)
            return true;
           return false;    
	}
}