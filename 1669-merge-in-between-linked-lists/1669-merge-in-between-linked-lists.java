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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        int cnt = 0;
        ListNode prev = null;
        ListNode curr = list1;
        while(cnt != a)
        {
            prev = curr;
            curr = curr.next;
            cnt++;
        }
        prev.next = list2;
        ListNode curr2 = list2;
        while(curr2.next != null)
        {
            curr2 = curr2.next;
        }
        while(cnt != b)
        {
            prev = curr;
            curr = curr.next;
            cnt++;
        }
        curr2.next = curr.next;
        curr.next = null;
        return list1;
    }
}