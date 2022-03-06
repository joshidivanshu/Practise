// { Driver Code Starts
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Main {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            String[] ab = br.readLine().trim().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            GfG g = new GfG();
            System.out.println(g.findDist(root, a, b));
        }
    }
}
// } Driver Code Ends


// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    Node lca(Node root, int a, int b)
    {
        if(root == null || root.data == a || root.data == b)
            return root;
        Node left = lca(root.left, a, b);
        Node right = lca(root.right, a, b);
        if(left == null)
            return right;
        if(right == null)
            return left;
        return root;    
    }
    public boolean getPath(Node root, int a,List<Integer> path)
    {
        if(root == null)
            return false;
        path.add(root.data);    
        if(root.data == a)
        {
            return true;
        }
        if(getPath(root.left,a,path) || getPath(root.right,a,path))
            return true;
        path.remove(path.size()-1);
        return false;
    }
    public int solve(Node root, int a)
    {
        if(root == null)
            return 0;
        if(root.data == a)
            return 1;
        int left = solve(root.left, a);
        int right = solve(root.right, a);
        if(left == 0 && right == 0)
            return 0;
        return left+right+1;
    }
    int findDist(Node root, int a, int b) {
        // Your code here
        Node l = lca(root,a,b);
        List<Integer> temp = new ArrayList<Integer>();
        getPath(l,a,temp);
        int x = temp.size();
        temp.clear();
        getPath(l,b,temp);
        int y = temp.size();
        return x+y-2;
    }
}