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
    int i = 0;

    public TreeNode bstFromPreorder(int[] pre) {
        return build(pre , Integer.MAX_VALUE);
        
    }
    public TreeNode build(int arr[] , int max){
        if(i == arr.length || arr[i] > max) return null;
        int val = arr[i++];
        TreeNode root = new TreeNode(val);
        root.left =  build(arr,root.val);
        root.right = build(arr,max);
        return root;

    }
}