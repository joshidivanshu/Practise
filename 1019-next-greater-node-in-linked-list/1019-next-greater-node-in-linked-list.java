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
        List<Integer> arr = new ArrayList<>();
        ListNode p = head;
//         storing node values in an arrayList
        while(p!=null){
            arr.add(p.val);
            p = p.next;
        }
        
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[arr.size()];//auto initialized to all zero
        
        for(int i = 0;i<arr.size();i++){
            
            while(!stack.isEmpty() && arr.get(stack.peek()) < arr.get(i)){
                res[stack.pop()] = arr.get(i);
            }
            stack.push(i);
        }
        return res;
    }
}