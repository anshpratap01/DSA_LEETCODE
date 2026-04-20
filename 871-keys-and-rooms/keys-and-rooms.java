class Solution {
    public void  bfs(List<List<Integer>> rooms , boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while(q.size() > 0){
            int curr= q.poll();
            for(int j = 0; j<rooms.get(curr).size(); j++){
                int child = rooms.get(curr).get(j);
                if(!visited[child]){
                    q.add(child);
                    visited[child] = true;
                }
            }

        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();
        boolean visited[] = new boolean[n];

        bfs(rooms,visited);

        for(int i = 0; i<n; i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
        
    }
}