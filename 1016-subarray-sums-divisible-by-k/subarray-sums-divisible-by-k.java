class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer , Integer> mp = new HashMap<>();
        mp.put(0,1);


        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];

            int rem = sum%k;

            if(rem < 0){
                rem += k;
            }

            if(mp.containsKey(rem)){
                count+= mp.get(rem);
            }

            mp.put(rem , 1+ mp.getOrDefault(rem ,0));

        }
        return count;
        
    }
}