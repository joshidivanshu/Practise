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
    public ListNode detectCycle(ListNode head) {
        ListNode slow,fast;
        if(head==null||head.next==null)
            return null;
        slow=head;
        fast=head;
        while(fast!=null&&fast.next!=null)
        {
            fast = fast.next.next;
                    slow = slow.next;
            if (fast == slow){
                ListNode slow2 = head; 
                while (slow2 != slow){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                        return slow;
                    }
            
        }
        return null;
    }
}