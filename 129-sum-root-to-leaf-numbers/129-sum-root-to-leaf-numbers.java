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
    int res = 0;
    public void fun(TreeNode root, int sum)
    {
        if(root != null)
        {
            if(root.left == null && root.right == null)
            {
                sum = sum*10+root.val;
                res += sum;
                return;
            }
            sum = sum*10+root.val;
            fun(root.left, sum);
            fun(root.right, sum);
        }
    }
    public int sumNumbers(TreeNode root) {
        res = 0;
        fun(root, 0);
        return res;
    }
}