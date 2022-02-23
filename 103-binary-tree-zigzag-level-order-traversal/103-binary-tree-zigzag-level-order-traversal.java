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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        int lvl = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> temp = new ArrayList<Integer>();
            Stack<Integer> st = new Stack<>();
            if(lvl%2 == 0)
            {
                for(int i=0;i<size;i++)
                {
                    TreeNode curr = q.poll();
                    temp.add(curr.val);
                    if(curr.left != null)
                        q.add(curr.left);
                    if(curr.right != null)
                        q.add(curr.right);
                }
            }
            else
            {
                for(int i=0;i<size;i++)
                {
                    TreeNode curr = q.poll();
                    st.push(curr.val);
                    if(curr.left != null)
                        q.add(curr.left);
                    if(curr.right != null)
                        q.add(curr.right);
                }
                while(!st.isEmpty())
                {
                    temp.add(st.pop());
                }
            }
            lvl++;
            res.add(temp);
        }
        return res;
    }
}