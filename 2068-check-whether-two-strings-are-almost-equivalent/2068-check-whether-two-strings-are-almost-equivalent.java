class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int arr1[] = new int[256];
        int arr2[] = new int[256];
        int n1 = word1.length();
        int n2 = word2.length();
        for(int i=0;i<n1;i++)
            arr1[word1.charAt(i)]++;
        for(int i=0;i<n2;i++)
            arr2[word2.charAt(i)]++;
        for(int i=0;i<256;i++)
        {
            if(Math.abs(arr1[i]-arr2[i]) > 3)
                return false;
        }
        return true;
    }
}