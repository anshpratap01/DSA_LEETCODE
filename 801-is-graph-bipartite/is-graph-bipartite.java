class Solution {
    boolean ans;
    public void dfs(int i, int[][] graph, int visited[] ){
        ///Queue<Integer> q = new LinkedList<>();
        
       // q.add(i);

       for(int ele : graph[i]){
       // int color = visited[ele];
       // same color means graph is not bip
                if(visited[ele] == visited[i]){
                    ans = false;
                    return;
                }
                if(visited[ele] == -1){
                    visited[ele] = 1- visited[i];
                   dfs(ele , graph, visited);
                }
            }

    //     while(q.size() > 0){
    //         int curr = q.poll();
    //         int color = visited[curr];
    //         for(int ele : graph[curr]){
    //             if(visited[ele] == visited[curr]){
    //                 ans = false;
    //                 return;
    //             }
    //             if(visited[ele] == -1){
    //                 visited[ele] = 1- color;
    //                 q.add(ele);
    //             }
    //         }

    //     }

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
                 visited[i] = 0;
                dfs(i , graph, visited);
            }
        }
        return ans;
    }
}