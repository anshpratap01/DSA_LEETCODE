/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans;
    public void solve(TreeNode org , TreeNode clo , TreeNode target){
        if(org == null) return;
        if(org.val == target.val){
            ans = clo;
            return;
        }
        solve(org.left, clo.left,target);
        solve(org.right, clo.right, target);

    }
     
    public final TreeNode getTargetCopy(final TreeNode org, final TreeNode clo, final TreeNode target) {
        ans = null;
     solve(org, clo , target);
        return ans;
    }
}