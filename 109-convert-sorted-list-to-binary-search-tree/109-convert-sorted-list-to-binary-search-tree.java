/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode fun(List<Integer> arr,int l,int h)
    {
        if(l>h)
            return null;
        int mid = l+(h-l)/2;
        TreeNode node = new TreeNode(arr.get(mid));
        node.left = fun(arr,l,mid-1);
        node.right = fun(arr,mid+1,h);
        return node;
        
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        ListNode curr = head;
        List<Integer> arr = new ArrayList<Integer>();
        while(curr != null)
        {
            arr.add(curr.val);
            curr = curr.next;
        }
        return fun(arr,0,arr.size()-1);
        
    }
}