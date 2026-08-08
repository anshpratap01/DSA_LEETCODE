class Solution {
    public int[] twoSum(int[] nums, int target) {

         HashMap<Integer, Integer> mp = new HashMap<>();

        // for(int i = 0; i< nums.length; i++){
        //     mp.put(nums[i] , i);
        // }
         

         for(int i = 0; i<nums.length; i++){
            int rest = target - nums[i];
            if(mp.containsKey(rest) ){
                return new int[] { mp.get(rest) , i+1};
            }
             mp.put(nums[i] , i+1);
         }
         return new int[]{};
        
    }
}