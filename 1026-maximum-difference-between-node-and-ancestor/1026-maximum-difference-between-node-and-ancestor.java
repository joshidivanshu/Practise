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
    public int fun(TreeNode root,int max, int min)
    {
        if(root == null)
            return max-min;
        
        if(root.val > max)
            max = root.val;
        if(root.val < min)
             min = root.val;
        return Math.max(fun(root.left,max,min), fun(root.right,max,min));
        
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root == null)
            return 0;
        return fun(root, root.val,root.val);
    }
}