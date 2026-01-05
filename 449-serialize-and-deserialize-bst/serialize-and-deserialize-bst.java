/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int i = 0;

    // Encodes a tree to a single string.
    void preorder(TreeNode root , StringBuilder sb){
        if(root == null) return;
        sb.append(root.val).append(",");
        preorder(root.left,sb);
        preorder(root.right,sb);
        
    }
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root,sb);
        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()== 0) return null;
        String arr[] = data.split(",");
        return helper(arr,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
    }
    TreeNode helper(String arr[] , int min , int max){
        if(i == arr.length) return null;
        int val = Integer.valueOf(arr[i]);
        if(val <min || val > max) return null;
        i++;
        TreeNode root = new TreeNode(val);
        root.left = helper(arr,min,val);
        root.right = helper(arr,val,max);
        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;