class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0)
            return true;
        String s1 = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isDigit(s1.charAt(i)) || Character.isLetter(s1.charAt(i)))
                res.append(s1.charAt(i));
        }
        // System.out.println(res);
        String s2 = new String(res);
        // System.out.println(s2);
        String s3 = new String(res.reverse());
        // System.out.println(s3);
        return s2.equals(s3);
    }
}