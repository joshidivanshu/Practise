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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null)
            return head;
        ListNode second = head;
        ListNode first = head;
        ListNode swap1 = null;
        int cnt = 1;
        while(cnt <k && first != null)
        {
            first = first.next;
            cnt++;
        }
        swap1 = first;
        while(first.next != null)
        {
            second = second.next;
            first = first.next;
        }
        if(swap1 != null)
        {
            int temp = swap1.val;
            swap1.val = second.val;
            second.val = temp;
        }
        return head;
    }
}