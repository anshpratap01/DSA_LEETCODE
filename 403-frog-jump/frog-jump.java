class Solution {
    int n;
    HashMap<Integer , Integer> mp;
    HashMap<String, Boolean> dp;  // memo

    public boolean solve(int arr[], int curr_st_idx , int prevj){
        // base case
        if(curr_st_idx == n-1){
            return true;
        }

        // memo check
        String key = curr_st_idx + "-" + prevj;
        if(dp.containsKey(key)){
            return dp.get(key);
        }

        for(int next = prevj-1 ; next <= prevj+1; next++){
            if(next > 0){
                int nextstone = arr[curr_st_idx] + next;

                if(mp.containsKey(nextstone)){
                    if(solve(arr , mp.get(nextstone), next)){
                        dp.put(key, true);
                        return true;
                    }
                }
            }
        }

        dp.put(key, false);
        return false;
    }

    public boolean canCross(int[] arr) {
        mp = new HashMap<>();
        dp = new HashMap<>();
        n = arr.length;

        if(arr[1] != 1){
            return false;
        }

        for(int i = 0; i < arr.length; i++){
            mp.put(arr[i], i);
        }

        return solve(arr, 0 , 0);
    }
}