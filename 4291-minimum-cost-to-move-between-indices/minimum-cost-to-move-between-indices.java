class Solution {
    public int[] minCost(int[] a, int[][] q) {
        int n = a.length;
        int pr[] = new int[n];
        int pl[] = new int[n];

        for(int i = 0;i<n-1; i++){
            if(i==0){
                pr[i+1] = pr[i] +1;
            }else{
                int d1 = a[i] -a[i-1];
                int d2 = a[i+1] - a[i];
               // pr[i+1] = pr[i] + (d2 < d1 ? 1 : d2);
                if(d2<d1){
                    pr[i+1] = pr[i] +1;
                }else{
                    pr[i+1] = pr[i]+d2;
                }
                
            }
        }
        for(int i= n-1; i>0; i--){
            if(i == n-1){
                pl[i-1] = pl[i]+1;
            }else{
             int d1 = a[i] -a[i-1];
            int d2 = a[i+1] - a[i];
                pl[i-1] = pl[i] +(d1<=d2 ?1 : d1);
            }
        }
        int m = q.length;
        int ans[] = new int[m];
        for(int i= 0; i<m; i++){
            int u = q[i][0];
            int v = q[i][1];
            ans[i] = u<v ? pr[v] -pr[u]:pl[v]-pl[u];
        }
        return ans;
        
    }
}