class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer , Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int sum = 0;
        int max = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                sum+=-1;
            }else{
                sum+=1;
            }

            if(mp.containsKey(sum)){
                max = Math.max(max  , i - mp.get(sum));

            }else{
                mp.put(sum , i);
            }

        }
        return max;
        
    }
}