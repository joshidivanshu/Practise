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
    public int getDecimalValue(ListNode head) {
        if(head == null)
            return 0;
        StringBuilder res = new StringBuilder();
        ListNode curr = head;
        while(curr != null)
        {
            res.append(curr.val);
            curr = curr.next;
        }
        return Integer.parseInt(res.toString(),2);
    }
}