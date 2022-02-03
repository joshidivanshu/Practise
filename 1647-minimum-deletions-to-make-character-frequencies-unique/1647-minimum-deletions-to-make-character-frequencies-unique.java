class Solution {
    public int minDeletions(String s) {
        int n = s.length();
        int arr[] = new int[256];
        for(int i=0;i<n;i++)
        {
            arr[s.charAt(i)]++;
        }
        Set<Integer> freq = new HashSet<Integer>();
        int cnt = 0;
        for(int i=0;i<256;i++)
        {
            while(arr[i] != 0 && freq.contains(arr[i]))
            {
                arr[i]--;
                cnt++;
            }
            freq.add(arr[i]);
        }
        return cnt;
    }
}