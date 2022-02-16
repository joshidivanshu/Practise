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
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    int res = 0;
    public void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            res = Math.max(height(root.left)+height(root.right),res);
            inorder(root.right);
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        res = 0;
        inorder(root);
        return res;
    }
}