import java.util.*;
class Solution {

    public  int helper(int n, int k, int idx,List<Integer> ans){
        if(ans.size()== 1)  return ans.get(0);
        idx = (idx + k - 1) % ans.size();
        ans.remove(idx);
        return helper(n,k,idx,ans);
    }
    public int findTheWinner(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i  = 1; i<=n; i++){
            ans.add(i);
        }
        int idx = 0;
        return helper(n, k, idx,ans);
        
    }
}