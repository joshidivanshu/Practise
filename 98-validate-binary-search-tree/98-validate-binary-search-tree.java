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
    public static boolean fun(long max,long min,TreeNode root)
    {
        if(root == null)
            return true;
        if(root.val <= min || root.val >= max)
            return false;
        return fun(root.val,min,root.left) && fun(max,root.val,root.right);
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        return fun(Long.MAX_VALUE,Long.MIN_VALUE,root);
    }
}