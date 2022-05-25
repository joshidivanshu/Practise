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
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int res = 0;
        q.add(root);
        while(!q.isEmpty())
        {
            int cnt = q.size();
            int curr_sum = 0;
            for(int i=0;i<cnt;i++)
            {
                TreeNode curr = q.poll();
                curr_sum += curr.val;
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            res = curr_sum;
        }
        return res;
    }
}