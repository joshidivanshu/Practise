class Solution {
    public boolean hasAlternatingBits(int n) {
        while( n != 0)
        {
            if(((n&1) ^ ((n>>1)&1)) == 0)
                return false;
            n = n>>1;
        }
        return true;
    }
}