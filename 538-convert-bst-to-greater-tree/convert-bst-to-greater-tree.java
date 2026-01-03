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
    int sum;
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.right);
        int val = root.val;
        root.val = sum + val;
        sum = sum+val;
        inorder(root.left);
    }
   
    public TreeNode convertBST(TreeNode root) {
       // ArrayList<TreeNode> ans = new ArrayList<>();
        
       //Collections.reverse(ans);
         sum = 0;
         inorder(root);
        
        return root;
        
    }
}