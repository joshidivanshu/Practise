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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
        ListNode curr = head;
        int size = 1;
        while(curr.next != null)
        {
            size++;
            curr = curr.next;
        }
        curr.next = head;
        k = k%size;
        ListNode first = head;
        ListNode second = head;
        while(k != 0 && first != null)
        {
            first = first.next;
            k--;
        }
        while(first != curr)
        {
            second = second.next;
            first = first.next;
        }
        ListNode res = second.next;
        second.next = null;
        return res;
        
        
    }
}