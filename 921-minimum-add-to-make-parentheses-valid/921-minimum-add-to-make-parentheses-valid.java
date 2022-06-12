class Solution {
    public boolean isMatching(char a, char b)
    {
        if((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'))
            return true;
        return false;
    }
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int n = s.length();
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                st.push(s.charAt(i));
            else 
            {
                if(st.isEmpty())
                    cnt++;
                else if(!isMatching(st.peek(), s.charAt(i)))
                    cnt++;
                else
                    st.pop();
            }
        }
        
        cnt += st.size();
        return cnt;
    }
}