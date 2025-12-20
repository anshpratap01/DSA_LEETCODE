class Solution {
    public long countGood(int[] nums, int k) {
        int i = 0;
        int j = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int pair = 0;
        long result = 0;
        int n = nums.length;

        while(j<nums.length){

            pair += mp.getOrDefault(nums[j],0);

            mp.put(nums[j],1+mp.getOrDefault(nums[j],0));

            while(pair>=k){

                result += (n-j);

                //shrink
                mp.put(nums[i],mp.get(nums[i])-1);
                pair -= mp.get(nums[i]);
                i++;
                

            }
            j++;



        }
        return result;
        
    }
}