class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int cnt = 0;
         mp.put(0 , -1);
        for(int i = 0 ; i<nums.length; i++){
            sum = sum+ nums[i];

            int rem = sum%k;

            if(rem < 0){
                rem += k;
            }

            if(mp.containsKey(rem)){
                if(i-mp.get(rem) >=2 ) return true;
            }else{
                mp.put(rem , i);
            }
        }
        return false;
        
    }
}