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
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){
             next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        // ListNode dummy = new ListNode(0);
        // ListNode temp = dummy;

        // ListNode curr = head;

        // while (curr != null) {
        //     temp.next = new ListNode(curr.val);
        //     temp = temp.next;
        //     curr = curr.next;
        // }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = reverse(slow);


       // ListNode head2 = reverse(dummy.next);

       while(head2 != null){
        if(head.val != head2.val){
            return false;
        }
        head = head.next;
        head2 = head2.next;
       }
       return true;

        
        
    }
}