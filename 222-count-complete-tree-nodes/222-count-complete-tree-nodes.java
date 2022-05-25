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
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        int lh = 0;
        TreeNode curr = root;
        while(curr != null)
        {
            curr = curr.left;
            lh++;
        }
        curr = root;
        int rh = 0;
        while(curr != null)
        {
            curr = curr.right;
            rh++;
        }
        if(lh == rh)
            return (int)Math.pow(2,lh)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}