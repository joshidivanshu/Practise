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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> res = new ArrayList<Integer>();
        ListNode curr = head;
        while(curr != null)
        {
            res.add(curr.val);
            curr = curr.next;
        }
        int arr[] = new int[res.size()];
        arr[res.size()-1] = 0;
        for(int i=0;i<res.size()-1;i++)
        {
            for(int j=i+1;j<res.size();j++)
            {
                if(res.get(j) > res.get(i))
                {
                    arr[i] = res.get(j);
                    break;
                }
            }
        }
        return arr;
    }
}