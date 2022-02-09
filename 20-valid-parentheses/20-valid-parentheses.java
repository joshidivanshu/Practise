class Solution {
    public boolean isMatching(char a, char b)
    {
        if((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}')) 
            return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                st.push(s.charAt(i));
            else
            {
                if(st.isEmpty())
                    return false;
                if(!isMatching(st.peek(),s.charAt(i)))
                    return false;
                else
                    st.pop();
            }
        }
        return st.isEmpty();
    }
}