class Solution {
    boolean ans;
    public void bfs(int i, int[][] graph, int visited[] ){
        Queue<Integer> q = new LinkedList<>();
        visited[i] = 0;
        q.add(i);
        while(q.size() > 0){
            int curr = q.poll();
            int color = visited[curr];
            for( int ele : graph[curr]){
                if(visited[ele] == visited[curr]){
                    ans = false;
                    return;
                }
                if(visited[ele] == -1){
                    visited[ele] = 1- color;
                    q.add(ele);
                }
            }

        }

    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        ans = true;
        int visited[] = new int[n];
        for(int i = 0;i<n; i++){
            visited[i] = -1;
        }

        for(int i= 0; i<n; i++){
            if(visited[i] == -1){
                bfs(i , graph, visited);
            }
        }
        return ans;
    }
}