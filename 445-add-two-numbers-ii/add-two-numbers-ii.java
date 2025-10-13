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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode agla = null;
        ListNode prev = null;

        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;

        }
        return prev;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode L1 = reverse(l1);
        ListNode L2 = reverse(l2);

        ListNode ans = null;
        int carry = 0;
        while(L1 != null || L2 != null || carry>0){
            int sum = carry;
            if(L1 != null){
                sum = sum+L1.val;
                L1 = L1.next;

            }
            if(L2 != null){
                sum = sum+L2.val;
                L2 = L2.next;
            }

            ListNode newNode = new ListNode(sum%10);
            newNode.next = ans;
            ans = newNode;
            carry = sum/10;
        }
        return ans;
        
    }
}