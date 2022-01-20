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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while(curr1 != null && curr2 != null)
        {
            if(carry == 0)
            {
                int sum = curr1.val+curr2.val;
                carry = sum/10;
                ListNode temp = new ListNode(sum%10);
                curr.next =  temp;
                curr = temp;
                
            }
            else
            {
                int sum = curr1.val+curr2.val+carry;
                carry = sum/10;
                ListNode temp = new ListNode(sum%10);
                curr.next = temp;
                curr = temp;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while(curr1 != null)
        {
            int sum = curr1.val+carry;
            ListNode temp = new ListNode(sum%10);
            carry = sum/10;
            curr.next = temp;
            curr = temp;
            curr1 = curr1.next;
        }
        while(curr2 != null)
        {
            int sum  = curr2.val+carry;
            ListNode temp = new ListNode(sum%10);
            carry = sum/10;
            curr.next = temp;
            curr = temp;
            curr2 = curr2.next;
        }
        if(carry != 0)
        {
            ListNode temp = new ListNode(carry);
            curr.next = temp;
            curr = temp;
        }
        return dummy.next;
        
    }
}