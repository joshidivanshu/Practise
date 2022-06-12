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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(1);
        ListNode curr1 = dummy1;
        ListNode curr2 = dummy2;
        ListNode curr = head;
        while(curr != null)
        {
            if(curr.val < x)
            {
                ListNode temp = new ListNode(curr.val);
                curr1.next = temp;
                curr1 = temp;
            }
            else
            {
                ListNode temp = new ListNode(curr.val);
                curr2.next = temp;
                curr2 = temp;
            }
            curr = curr.next;
        }
        curr1.next = dummy2.next;
        return dummy1.next;
    }
}