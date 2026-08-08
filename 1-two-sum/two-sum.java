class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // for(int i = 0; i< nums.length; i++){
        //     mp.put(nums[i] , i);
        // }
         

         for(int i = 0; i<nums.length; i++){
            int rest = target - nums[i];
            if(mp.containsKey(rest) && mp.get(rest) != i){
                return new int[] { i ,  mp.get(rest) };
            }
             mp.put(nums[i] , i);
         }
         return new int[]{};

        
    }
}