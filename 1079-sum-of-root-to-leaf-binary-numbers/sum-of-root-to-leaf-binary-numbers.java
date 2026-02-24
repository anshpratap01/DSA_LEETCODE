class Solution {
    int sum;

    public void solver(TreeNode root, StringBuilder sb) {
        if (root == null) return;

        sb.append(root.val);

       
        if (root.left == null && root.right == null) {
            int decimal = Integer.parseInt(sb.toString(), 2);
            sum += decimal;
        } else {
            solver(root.left, sb);
            solver(root.right, sb);
        }

        
        sb.deleteCharAt(sb.length() - 1);
    }

    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        if (root == null) return 0;

        solver(root, new StringBuilder());
        return sum;
    }
}