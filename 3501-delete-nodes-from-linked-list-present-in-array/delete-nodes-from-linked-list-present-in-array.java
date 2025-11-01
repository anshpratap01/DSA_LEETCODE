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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode f = new ListNode(0);
        ListNode tail = f;

        Set<Integer> st = new HashSet<>();
        for(int a : nums){
            st.add(a);
        }

        while(head != null){
            if(!st.contains(head.val)){
                tail.next = new ListNode(head.val);
                tail = tail.next;

            }
            head = head.next;
        }
        return f.next;
        
    }
}