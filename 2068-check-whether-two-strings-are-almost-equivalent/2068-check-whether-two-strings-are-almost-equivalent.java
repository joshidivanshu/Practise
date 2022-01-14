class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int arr[] = new int[256];
        for(int i=0;i<word1.length();i++)
        {
            arr[word1.charAt(i)]++;
            arr[word2.charAt(i)]--;
        }
        for(int l : arr)
        {
            if(l < -3 || l >3)
                return false;
        }
        return true;
    }
}