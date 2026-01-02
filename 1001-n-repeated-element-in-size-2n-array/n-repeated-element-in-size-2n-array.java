class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            mp.put(nums[i],1+mp.getOrDefault(nums[i],0));
        }
          int ans = 0;
        for(var e : mp.keySet()){
            if(mp.get(e) >1){
                ans = e;
            }
        }
        return ans;
        
    }
}