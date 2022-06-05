class Solution {
    public boolean isVowel(char a)
    {
        if(a == 'a' || a == 'i' || a == 'e' || a == 'o' || a == 'u')
            return true;
        if(a == 'A' || a == 'O' || a == 'I' || a == 'E' || a == 'U' )
            return true;
        return false;
    }
    public String reverseVowels(String s) {
        int l = 0;
        int h = s.length()-1;
        char[] temp = s.toCharArray();
        while(l<h)
        {
            if(isVowel(temp[l]) && isVowel(temp[h]))
            {
                char k = temp[l];
                temp[l] = temp[h];
                temp[h] = k;
                l++;
                h--;
            }
            else if(!isVowel(temp[l]))
            {
                l++;
            }
            else
            {
                h--;
            }
        }
        return new String(temp);
    }
}