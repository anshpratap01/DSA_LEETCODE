class Solution {
    List<String> a;

    public void solve(TreeNode root, String s) {
        if (root == null){ 
            return;
        }
         s += root.val;

        // Leaf node
        if (root.left == null && root.right == null) {
            a.add(s);
            return;
        }

        solve(root.left, s);
        solve(root.right, s);
    }

    public int sumNumbers(TreeNode root) {
        a = new ArrayList<>();
        solve(root, "");

        int sum = 0;
        for (String num : a) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}