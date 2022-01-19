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
    int vistdindx = 0;
    int res = 0;
    public void inorder(TreeNode root,int k)
    {
        if(root != null)
        {
            inorder(root.left,k);
            vistdindx++;
            if(vistdindx == k)
                res = root.val;
            inorder(root.right,k);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        vistdindx = 0;
        res = 0;
        inorder(root,k);
        return res;
    }
}