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
    TreeNode prev = null;
    int res = Integer.MAX_VALUE;
    public void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            if(prev == null)
            {
                prev = root;
            }
            else
            {
                res = Math.min(res, root.val-prev.val);
                prev = root;
            }
            inorder(root.right);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        if(root == null)
            return 0;
        res = Integer.MAX_VALUE;
        inorder(root);
        return res;
    }
}