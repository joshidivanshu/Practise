/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        Set<ListNode> hs = new HashSet<ListNode>();
        ListNode curr = head;
        while(curr != null)
        {
            if(hs.contains(curr))
                return true;
            hs.add(curr);
            curr = curr.next;
        }
        return false;
    }
}