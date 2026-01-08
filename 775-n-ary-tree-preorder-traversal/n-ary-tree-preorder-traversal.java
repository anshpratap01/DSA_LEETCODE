/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void preorder(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        for(int i = 0; i<root.children.size(); i++){
            Node child = root.children.get(i);
            preorder(child,ans);
        }
    }
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        return ans;
        
    }
}