class Solution {
    public int[][] merge(int[][] inter) {

        Arrays.sort(inter , (a,b) -> a[0] - b[0]);
       

        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(inter[0]);

        for(int i = 1; i<inter.length; i++){
            int last[] = ans.get(ans.size()-1);
            int curr[] = inter[i];

            if(curr[0] <= last[1]){
                last[1] = Math.max(last[1] , curr[1]);
            }else{
                ans.add(curr);
            }
        }
         return ans.toArray(new int[ans.size()][]);
    }
}