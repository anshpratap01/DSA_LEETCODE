class Solution {
    public void  bfs(int start , List<List<Integer>> adj , boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(q.size() > 0){
            int curr= q.poll();
            for(int j = 0; j<adj.get(curr).size(); j++){
                int child = adj.get(curr).get(j);
                if(!visited[child]){
                    q.add(child);
                    visited[child] = true;
                }
            }

        }
    }
    public boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>>adj = new ArrayList<>();

        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean visited [] = new  boolean[n];
        visited[start] = true;
        bfs(start,adj,visited);

        return visited[end];
        

    }
}