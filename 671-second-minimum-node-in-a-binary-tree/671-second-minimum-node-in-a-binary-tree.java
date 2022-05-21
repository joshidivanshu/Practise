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
    TreeSet<Integer> res = new TreeSet<Integer>();
    void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            res.add(root.val);
            inorder(root.right);
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        res.clear();
        if(root == null)
            return -1;
        inorder(root);
        int i = 0;
        for(int val : res)
        {
            i++;
            if(i == 2)
                return val;
        }
        return -1;
        
    }
}