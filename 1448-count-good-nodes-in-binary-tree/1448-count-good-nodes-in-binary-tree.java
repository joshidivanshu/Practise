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
    int cnt = 0;
    public void preOrder(TreeNode root,int max)
    {
        if(root != null)
        {
            if(root.val >= max)
            {
                cnt++;
                max = Math.max(root.val,max);
            }
            preOrder(root.left, max);
            preOrder(root.right,max);
        }
    }
    public int goodNodes(TreeNode root) {
        cnt = 0;
        if(root == null)
            return 0;
        preOrder(root,root.val);
        return cnt;
    }
}