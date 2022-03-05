class Solution {
    public int sumSquare(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            sum += (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(true)
        {
            n = sumSquare(n);
            if(n == 1)
                return true;
            if(hs.contains(n))
                return false;
            hs.add(n);
       }
    }
}