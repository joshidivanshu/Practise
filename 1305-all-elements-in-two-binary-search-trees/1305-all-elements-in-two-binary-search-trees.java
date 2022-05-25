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
    List<Integer> a1 = new ArrayList<Integer>();
    List<Integer> a2 = new ArrayList<Integer>();
    List<Integer> res = new ArrayList<Integer>();
    
    public void inorder(TreeNode root,List<Integer> arr)
    {
        if(root != null)
        {
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        a1.clear();
        a2.clear();
        res.clear();
        inorder(root1,a1);
        inorder(root2,a2);
        if(root1 == null )
            return a2;
        if(root2 == null)
            return a1;
        int i = 0 , j = 0;
        while(i<a1.size() && j<a2.size())
        {
            if(a1.get(i) < a2.get(j))
            {
                res.add(a1.get(i));
                i++;
            }
            else
            {
                res.add(a2.get(j));
                j++;
            }
        }
        while(i<a1.size())
        {
            res.add(a1.get(i++));
        }
        while(j<a2.size())
        {
            res.add(a2.get(j++));
        }
        return res;
    }
}