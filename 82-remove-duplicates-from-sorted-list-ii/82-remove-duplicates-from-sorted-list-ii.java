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
        if(head == null || head.next == null)
            return head;
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        ListNode curr = head;
        while(curr != null)
        {
            hm.put(curr.val, hm.getOrDefault(curr.val,0)+1);
            curr = curr.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode head1 = dummy;
        curr =  head;
        while(curr != null)
        {
            if(hm.get(curr.val) == 1)
            {
                ListNode temp = new ListNode(curr.val);
                dummy.next = temp;
                dummy = temp;
            }
            curr = curr.next;
        }
        return head1.next;
    }
}