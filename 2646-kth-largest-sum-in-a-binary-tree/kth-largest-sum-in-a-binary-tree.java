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
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList< Long> ans = new ArrayList<>();
         if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int currlevel  = 1;
       
        
        q.add(root);
        while(q.size()>0){
            int n = q.size();
            long levelsum = 0;
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
                
            ans.add(levelsum);

            currlevel++;
        }
        long a = 0;
        Collections.sort(ans, Collections.reverseOrder());
        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        if(k>ans.size()){
            return -1;
        }
        
        for(int i = 1;i<=k; i++){
            a = ans.get(i-1);

        }
        return a;
        
         
        
    
        
    }
}