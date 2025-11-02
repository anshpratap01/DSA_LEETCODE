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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        
        ListNode temp  = head;
        st.push(temp.val);
        temp = temp.next;
       while (temp != null) {
            
            while (!st.isEmpty() && st.peek() < temp.val) {
                st.pop();
            }
            st.push(temp.val);
            temp = temp.next;
        }

        int arr[] = new int[st.size()];
        int n = arr.length;
        for(int i = n-1;i>=0; i--){
            arr[i] = st.pop();
            }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i = 0; i<n; i++){
            ListNode tail = new ListNode(arr[i]);
            curr.next = tail;
            curr = curr.next;

        }
        return dummy.next;




        
        
    }
}