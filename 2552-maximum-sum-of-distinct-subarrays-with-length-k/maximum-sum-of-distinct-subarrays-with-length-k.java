class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        int i = 0; 
       
        long sum =0;
        long max = Integer.MIN_VALUE;
       HashMap<Integer,Integer> mp = new HashMap<>();
        for(int j = 0; j<nums.length;j++){
            sum = sum+nums[j];
            mp.put(nums[j],1+mp.getOrDefault(nums[j],0));
            //if(length>k)
            if(j-i+1 > k){
                int left = nums[i];
                mp.put(left, mp.get(left) - 1);
                if(mp.get(left) == 0) mp.remove(left);
                sum -= left;
                i++;
            }
            // if length == k;
            if(j-i+1 == k){
                if(mp.size() == k){
                 max = Math.max(max,sum);

                }
            }
        
       
        
    }
   if(max == Integer.MIN_VALUE){
    return 0;
   }else{
    return max;

   } 
}
}