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
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root == null) return ;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        int sum = 0;
        for(int i = 0; i<ans.size(); i++){
            if(ans.get(i) >= low && ans.get(i) <= high){
                sum = sum+ans.get(i);
            }

        }
        return sum;
        
    }
}