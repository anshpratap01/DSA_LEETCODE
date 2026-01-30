class Solution {
    public void solve(int curr , int n , List<Integer> ans ){
        if(curr > n) return;
            
       
        ans.add(curr);
        for(int i = 0; i<=9; i++){
            int num = (curr*10) + i;
            if(num > n) return;
            solve(num , n , ans);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i<=9; i++){
            solve(i,n,ans);
        }
        return ans;
        
    }
}