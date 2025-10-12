class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            mp.put(nums[i],1+mp.getOrDefault(nums[i],0));
        }
        int sum = 0;
        for(var e : mp.keySet()){
            if(mp.get(e) %k == 0 ){
                int n = mp.get(e);
                sum = sum+n*e;
            }


        }
        return sum;

        
    }
}