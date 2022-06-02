class Solution {
    public String removeDigit(String number, char digit) {
        String res = "";
        int n = number.length();
        int i = 1;
        for(;i<n;i++)
        {
            if(number.charAt(i-1) == digit)
            {
                if(number.charAt(i) > number.charAt(i-1))
                    return number.substring(0,i-1)+number.substring(i);
            }
        }
        
        int lastIndex = number.lastIndexOf(digit);
        return number.substring(0,lastIndex)+number.substring(lastIndex+1);
    }
}