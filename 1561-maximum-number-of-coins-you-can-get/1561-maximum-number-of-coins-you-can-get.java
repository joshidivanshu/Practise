class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0;
        int n = piles.length;
        int l = 0;
        int h = n-1;
        while(l<h)
        {
            int temp = piles[l];
            piles[l] = piles[h];
            piles[h] = temp;
            l++;
            h--;
        }
        // for(int i=0;i<n;i++)
        //     System.out.print(piles[i]+" ");
        int i = 0;
        int it = 1;
        while(i<n/3){
            res += piles[it];
            it += 2;
            i++;
        }
        return res;
    }
}