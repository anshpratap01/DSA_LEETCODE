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
    public int getheight(ListNode head){
       if(head == null) return 0;
       int size = 0;
       ListNode temp = head;
       while(temp != null){
          size++;
          temp = temp.next;
       }
       return size;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = getheight(head);
        if(size == 1) return null;
        if(size == n) return head.next;

        if(n == 1){
            ListNode temp = head;
            for(int i = 1 ; i< size - n; i++){
                temp = temp.next;
            }
              temp.next= null;
        }else{

        ListNode temp = head;
        for(int i = 1; i<size - n; i++){
            temp = temp.next;     
        }
        temp.next = temp.next.next;
        }

        return head;





        
    }
}