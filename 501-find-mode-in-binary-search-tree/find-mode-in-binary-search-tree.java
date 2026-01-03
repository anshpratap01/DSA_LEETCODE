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
    public void preorder(TreeNode root , HashMap<Integer, Integer> mp, int[] arr){
        if(root == null) return ;
        int v  = root.val;
        mp.put(v, 1+ mp.getOrDefault(v,0));
        arr[0] = Math.max(arr[0],mp.get(v));
        preorder(root.left,mp,arr);
        preorder(root.right,mp,arr);
    }
    public int[] findMode(TreeNode root) {
        if(root.val == 0)return new int[]{0};
        int[] arr = {0};
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(root,mp,arr);
        for( var e : mp.keySet()){
            if(mp.get(e)==arr[0]) ans.add(e);
        }  
        int[] a = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) a[i] = ans.get(i);
        return a;
    }
}