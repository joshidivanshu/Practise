/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode fun(int[] nums,int l,int h)
    {
        if(l>h)
            return null;
        int mid = l+(h-l)/2;
        TreeNode temp = new TreeNode(nums[mid]);
        temp.left = fun(nums,l,mid-1);
        temp.right = fun(nums,mid+1,h);
        return temp;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        return fun(nums,0,nums.length-1);
    }
}