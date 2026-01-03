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
    public void  inorder(TreeNode root, ArrayList<Integer>ans){
        if(root == null) return ;
        inorder(root.left , ans);
        ans.add(root.val);
        inorder(root.right,ans);
     }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<ans.size()-1; i++){
        int diff = Math.abs(ans.get(i) - ans.get(i+1));
        min = Math.min(min,diff);

        }
        return min;
        
        
        

        
        
    }
}