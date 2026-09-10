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
    int count = 0;
    public int[] solver(TreeNode root){
        if(root == null) return new int[]{0,0};

        int left[] = solver(root.left);
        int right[] = solver(root.right);

        int subsum = left[0] + right[0] + root.val;
        int subtreecount = left[1] + right[1] + 1;

        if(subsum / subtreecount == root.val){
            count++;
        }
        return new int[]{subsum , subtreecount};
    }
    public int averageOfSubtree(TreeNode root) {
        solver(root);
        return count;
        
    }
}