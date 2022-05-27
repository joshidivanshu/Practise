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
    int sum = 0;
    public int postOrder(TreeNode root)
    {
        if(root != null)
        {
            int lsum = postOrder(root.left);
            int rsum = postOrder(root.right);
            sum += Math.abs(lsum-rsum);
            return lsum+rsum+root.val;
        }
        return 0;
    }
    public int findTilt(TreeNode root) {
        sum = 0;
        postOrder(root);
        return sum;
        
    }
}