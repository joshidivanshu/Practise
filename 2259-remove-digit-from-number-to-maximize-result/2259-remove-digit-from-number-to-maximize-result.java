class Solution {
    public String removeDigit(String number, char digit) {
        List<String> res = new ArrayList<String>();
        int n = number.length();
        for(int i=0;i<n;i++)
        {
            if(number.charAt(i) == digit)
            {
                res.add(number.substring(0,i)+number.substring(i+1));
            }
        }
        Collections.sort(res);
        return res.get(res.size()-1);
    }
}