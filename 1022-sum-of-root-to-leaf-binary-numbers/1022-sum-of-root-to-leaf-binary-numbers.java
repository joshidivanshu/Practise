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
    public int fun(TreeNode root, int sum)
    {
        if(root == null)
            return 0;
        sum = sum*2+root.val;
        int res = 0;
        res += fun(root.left, sum);
        res += fun(root.right, sum);
        
        if(root.left == null && root.right == null)
            return sum;
        return res;
    }
    public int sumRootToLeaf(TreeNode root) {
        int res = fun(root,0);
        return res;
    }
}