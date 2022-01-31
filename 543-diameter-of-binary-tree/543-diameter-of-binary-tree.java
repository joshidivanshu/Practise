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
    int d1 = 0;
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        d1 = Math.max(d1,lh+rh);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        d1 = 0;
        height(root);
        return d1;
        
        
        
    }
}