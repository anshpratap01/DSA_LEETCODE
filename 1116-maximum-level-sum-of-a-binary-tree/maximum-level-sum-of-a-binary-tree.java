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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int currlevel  = 1;
        int maxlevel = 0;
        int maxsum = Integer.MIN_VALUE;
        q.add(root);
        while(q.size()>0){
            int n = q.size();
            int levelsum = 0;
            for(int i = 0; i<n; i++){
                TreeNode curr = q.poll();
                levelsum = levelsum+curr.val;
                if(curr.left != null){
                    
                    q.add(curr.left);

                }
                if(curr.right  != null){
                    q.add(curr.right);

                    
                }
            }
                
            if (levelsum > maxsum) {
                maxsum = levelsum;
                maxlevel = currlevel;
            }

            currlevel++;
        }

        
                
            
        

        
    return maxlevel;
    }

}