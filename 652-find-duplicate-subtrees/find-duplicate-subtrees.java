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
    public String  solve(TreeNode root ,HashMap<String , Integer> mp,List<TreeNode>  ans){
        if(root == null) return "#";
        String l = solve(root.left,mp,ans);
        String r  = solve(root.right,mp,ans);

        String curr = root.val + "," +l+ "," +r;
        mp.put(curr,1+mp.getOrDefault(curr,0));
        
            if(mp.get(curr) == 2){
                ans.add(root);
            }
        
        return curr;



    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode>  ans = new ArrayList<>();
        HashMap<String , Integer> mp = new HashMap<>();
        solve(root,mp,ans);
        return ans;

        

    }
}