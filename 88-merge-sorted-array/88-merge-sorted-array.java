class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[n+m];
        int i = 0;
        int j = 0;
        int cnt = 0;
        while(i<m && j<n)
        {
            if(nums1[i] <= nums2[j])
            {
                res[cnt++] = nums1[i++];
            }
            else
            {
                res[cnt++] = nums2[j++];
            }
        }
        while(i<m)
        {
            res[cnt++] = nums1[i++];
        }
        while(j<n)
        {
            res[cnt++] = nums2[j++];
        }
        for(int k=0;k<n+m;k++)
        {
            nums1[k] = res[k];
        }
        return;
    }
}