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
    public void  inorder(TreeNode root, ArrayList<TreeNode>ans){
        if(root == null) return ;
        inorder(root.left , ans);
        ans.add(root);
        inorder(root.right,ans);
     }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        inorder(root,ans);
        TreeNode r = new TreeNode(ans.get(0).val);
        TreeNode temp = r;
        for(int i = 1; i<ans.size(); i++){
            r.right =  new TreeNode(ans.get(i).val);
            r = r.right;
            r.left = null;
        }
        return temp;

        
    }
}