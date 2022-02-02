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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((o1,o2)->o1.val-o2.val);
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        for(ListNode l : lists)
        {
            ListNode temp = l;
            while(temp != null)
            {
                pq.add(temp);
                temp = temp.next;
            }
        }
        while(!pq.isEmpty()) {
            dummy.next=pq.poll();
            dummy=dummy.next;
            dummy.next=null;
        }
        return head.next;
        
    }
}