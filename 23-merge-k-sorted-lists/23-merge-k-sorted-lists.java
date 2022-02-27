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
        int n = lists.length;
        for(int i=0;i<n;i++)
        {
            ListNode curr = lists[i];
            while(curr != null)
            {
                pq.add(curr);
                curr = curr.next;
            }
        }
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(!pq.isEmpty())
        {
            ListNode temp = new ListNode(pq.poll().val);
            curr.next = temp;
            curr = temp;
        }
        return dummy.next;
    }
}