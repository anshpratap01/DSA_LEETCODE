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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        int size = 0;
        List<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp  != null){
            ans.add(temp.val);
            temp  = temp.next;
        }
         int  n = ans.size();
        return convert(ans,0,n-1);
        
    }
    public TreeNode convert(List<Integer> ans , int lo, int hi){
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        TreeNode root = new TreeNode(ans.get(mid));
        root.left = convert(ans,lo,mid-1);
        root.right = convert(ans,mid+1,hi);
        return root;
    }
}