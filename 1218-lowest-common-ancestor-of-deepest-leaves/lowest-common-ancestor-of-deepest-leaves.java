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

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        List<TreeNode> deepest = getDeepestNodes(root);

        TreeNode ans = deepest.get(0);

        for (int i = 1; i < deepest.size(); i++) {
            ans = lca(root, ans, deepest.get(i));
        }

        return ans;
    }

    // Step 1: BFS to get deepest nodes
    public List<TreeNode> getDeepestNodes(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        List<TreeNode> level = new ArrayList<>();

        while (!q.isEmpty()) {
            int size = q.size();
            level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node);

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }

        return level; // last level = deepest nodes
    }

    // Step 2: Standard LCA
       public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if (left != null && right != null) return root;

        return left != null ? left : right;
    }
}