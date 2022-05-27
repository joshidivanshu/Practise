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
    public boolean fun(TreeNode root, int val)
    {
        if(root == null)
            return true;
        if(root.val != val)
            return false;
        return fun(root.left, val) && fun(root.right, val);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)
            return true;
        return fun(root, root.val);
    }
}