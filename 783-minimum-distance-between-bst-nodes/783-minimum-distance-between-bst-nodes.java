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
    List<Integer> res = new ArrayList<Integer>();
    public void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            res.add(root.val);
            inorder(root.right);
        }
    }
    public int minDiffInBST(TreeNode root) {
        if(root == null)
            return 0;
        int min_diff = Integer.MAX_VALUE;
        inorder(root);
        for(int i=1;i<res.size();i++)
        {
            min_diff = Math.min(min_diff, res.get(i)-res.get(i-1));
        }
        return min_diff;
    }
}