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
    public void dfs(List<Integer> arr, TreeNode root)
    {
        if(root == null)
            return;
        dfs(arr, root.left);
        if(root.left == null && root.right == null)
            arr.add(root.val);
        dfs(arr, root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1 = new ArrayList<Integer>();
        dfs(arr1,root1);
        List<Integer> arr2 = new ArrayList<Integer>();
        dfs(arr2,root2);
        return arr1.equals(arr2);
    }
}