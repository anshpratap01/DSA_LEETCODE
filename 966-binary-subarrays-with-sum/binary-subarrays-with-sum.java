class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer , Integer> mp = new HashMap<>();
        mp.put(0,1);
        int cnt = 0;
        int sum = 0;


        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];

            if(mp.containsKey(sum-goal)){
                cnt+= mp.get(sum-goal);
            }
            
                mp.put(sum  , 1+ mp.getOrDefault(sum ,0));
            

        }
        return cnt;
        
    }
}