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
    public void fun(TreeNode root, StringBuilder sb,List<String> res)
    {
        if(root != null)
        {
            
            if(root.left == null && root.right == null)
            {
                sb.append(root.val);
                res.add(new String(sb));
            }
            sb.append(root.val+"->");
            fun(root.left,new StringBuilder(sb),res);
            fun(root.right,new StringBuilder(sb),res);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root == null)
            return res;
        fun(root, new StringBuilder(), res);
        return res;
        
    }
}