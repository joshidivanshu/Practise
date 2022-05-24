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
    int min = Integer.MAX_VALUE;
    int smin = Integer.MAX_VALUE;
    boolean found = false;
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null)
            return -1;
        if(root.val < min)
        {
            min = root.val;
        }
        
        if(root.val > min && root.val <= smin)
        {
            smin = root.val;
            found = true;
        }
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);
        
        return (found == true) ? smin : -1;
    }
}