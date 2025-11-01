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
        // size
        int count = 0;
        ListNode size = head;
        while(size != null){
            count++;
            size = size.next;
        }

        ListNode temp = head;
        int arr[] = new int[count];
        int idx = 0;

        while(temp != null){
            arr[idx] = temp.val;
            idx++;
            temp = temp.next;

        }
        List<Integer> ans = new ArrayList<>();
        Set<Integer> remove = new HashSet<>();
        for(int n : nums){
            remove.add(n);
        }
        for(int a : arr){
        if(!remove.contains(a)){
            ans.add(a);
        }
       }
       ListNode an = new ListNode(ans.get(0));
        ListNode curr = an;

        for (int i = 1; i < ans.size(); i++) {
            ListNode tempp = new ListNode(ans.get(i));
            curr.next = tempp;
            curr = curr.next; 
        }

        return an;

        
    }
}