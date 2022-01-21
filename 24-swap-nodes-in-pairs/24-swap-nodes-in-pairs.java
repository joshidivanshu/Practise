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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode curr1 = head;
        ListNode curr2 = head.next;
        while(curr1 != null && curr2 != null)
        {
            int temp = curr1.val;
            curr1.val = curr2.val;
            curr2.val = temp;
            if(curr1.next != null)
                curr1 = curr1.next.next;
            if(curr2.next != null)
                curr2 = curr2.next.next;
        }
        return head;
         
    }
}