class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);

        }

        for(var e : mp.keySet()){
            if(mp.get(e) > nums.length/2){
                return e;
            }




        }
        return -1;

        
    }
}