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
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode last = null;
    TreeNode middle = null;
    public void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            if(prev == null)
            {
                prev = root;
            }
            else
            {
                if(prev.val > root.val && first == null)
                {
                    first = prev;
                    middle = root;
                }
                if(prev.val > root.val && first != null)
                {
                    last = root;
                }
                prev = root;
            }
            inorder(root.right);
        }
    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        if(first==null && last==null)
            return;
        else if(first != null && last == null)
        {
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
        else if(first != null && last != null)
        {
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }
        return;
    }
}