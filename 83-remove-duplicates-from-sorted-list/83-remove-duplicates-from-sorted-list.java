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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            if(prev == null)
            {
                prev = curr;
                curr = curr.next;
            }
            else if(prev.val == curr.val)
            {
                prev.next = curr.next;
                curr = curr.next;
            }
            else
            {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}