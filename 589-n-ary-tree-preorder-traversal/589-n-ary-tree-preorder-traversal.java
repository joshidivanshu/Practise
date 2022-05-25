/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    void preorder(Node root, List<Integer> res)
    {
        if(root != null)
            res.add(root.val);
        for(Node x : root.children)
        {
            preorder(x,res);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        preorder(root,res);
        return res;
    }
}