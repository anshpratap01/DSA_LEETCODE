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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);

        while(q.size()>0){
            ArrayList<Integer> arr = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i<n; i++){
            Node curr = q.poll();
            
            arr.add(curr.val);
            for(Node child :  curr.children){
                q.add(child);
            }
            }
            ans.add(arr);
        }
        return ans;
        
        
    }
}