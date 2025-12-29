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
    int maxsum;
    public int solve(TreeNode root){
        if(root == null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        int necche = left+right+root.val;
        int koiek = Math.max(left, right) + root.val;
        int onlyroot = root.val;

        maxsum =  Math.max(maxsum, Math.max(necche,Math.max( koiek,onlyroot)));
         
         return Math.max(koiek,onlyroot);


    }
    public int maxPathSum(TreeNode root) {
        maxsum = Integer.MIN_VALUE;
        solve(root);
        return maxsum;
        
    }
}