/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null)
            return null;
        if(headB == null)
            return null;
        Set<ListNode> hs = new HashSet<ListNode>();
        ListNode curr1 = headA;
        while(curr1 != null)
        {
            hs.add(curr1);
            curr1 = curr1.next;
        }
        ListNode curr2 = headB;
        while(curr2 != null)
        {
            if(hs.contains(curr2))
                return curr2;
            curr2 = curr2.next;
        }
        return null;
    }
}