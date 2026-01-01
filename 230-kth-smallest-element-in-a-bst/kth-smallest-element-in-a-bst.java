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
    public int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
      ArrayList<Integer> ans = new ArrayList<>();
        
        while(q.size()>0){

            
            int size = q.size();
            for(int i = 0 ; i<size; i++){
                TreeNode curr  = q.poll();
                ans.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

        }

        Collections.sort(ans);
        System.out.print(ans.size());
         return ans.get(k-1);

        
    }
}