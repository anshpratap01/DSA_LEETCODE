class Solution {
    public void bfs(int graph[][] , boolean visited[] , int i){

        //int n  = graph.size();
        
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;

        while(q.size()>0){
            int curr = q.poll();
            for(int  j = 0; j<graph.length; j++){
                if(graph[curr][j] != 0 && !visited[j]){
                    q.add(j);
                    visited[j] = true;
                }
            }
        }

    }
    public int findCircleNum(int[][] graph) {
        int n  = graph.length;
        boolean visited[] = new boolean[n];
        int cnt = 0;

        for(int i= 0; i<n; i++){
            if(!visited[i]){
                bfs(graph,visited, i);
                cnt++;
            }

        }
        return cnt;
  
    }
}