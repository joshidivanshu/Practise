class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        int n  = s.length();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int sum = 0;
        int i = 0;
        while(i<n)
        {
            if((i+1) < s.length())
            {
                int x1 = hm.get(s.charAt(i));
                int x2 = hm.get(s.charAt(i+1));
                if(x2 > x1)
                {
                    sum += x2-x1;
                    i+=2;
                }
                else
                {
                    sum += x1;
                    i++;
                }
            }
            else
            {
                sum += hm.get(s.charAt(i));
                i++;
            }
        }
        return sum;
    }
}