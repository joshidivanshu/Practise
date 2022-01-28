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
    public boolean fun(long min,TreeNode root,long max)
    {
        if(root == null)
            return true;
        if(root.val > min && root.val < max)
            return fun(min,root.left,root.val) && fun(root.val,root.right,max);
        return false;
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        return fun(Long.MIN_VALUE,root,Long.MAX_VALUE);
    }
}