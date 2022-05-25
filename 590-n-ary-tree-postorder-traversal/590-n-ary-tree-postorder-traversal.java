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
    void postorder(Node root, List<Integer> res)
    {
        for(Node x : root.children)
        {
            postorder(x,res);
        }
        res.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        postorder(root, res);
        return res;
    }
}