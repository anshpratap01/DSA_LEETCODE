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
    public String serialize(TreeNode root) {
       if(root == null) return "*";
       String result = "";
       result += root.val;
       result +=  "," + serialize(root.left);
       result += "," + serialize(root.right);
       return result;

        
    }

   
    public TreeNode deserialize(String data) {
        String arr[] = data.split(",");
       return helper(arr);
        
    }
    TreeNode helper(String nums[]){
        if( i == nums.length) return null;
        String num =nums[i++];

        if(num.equals("*")){
            return null;
        }
        TreeNode root =  new TreeNode(Integer.valueOf(num));
        root.left = helper(nums);
        root.right = helper(nums);
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));