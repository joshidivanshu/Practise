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
    public void fun(TreeNode root, int max)
    {
        if(root != null)
        {
            if(root.val >= max)
            {
                cnt++;
                max = Math.max(root.val, max);
            }
            fun(root.left, max);
            fun(root.right,max);
        }
    }
    public int goodNodes(TreeNode root) {
        if(root == null)
            return 0;
        cnt = 0;
        fun(root,root.val);
        return cnt;
    }
}