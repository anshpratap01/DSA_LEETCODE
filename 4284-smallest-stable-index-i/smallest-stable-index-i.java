class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
      //  int min = Integer.MAX_VALUE;
        int ans =  Integer.MAX_VALUE;
        for(int i = 0; i<nums.length ; i++){

            max = Math.max(nums[i] , max);
            int min = Integer.MAX_VALUE;

            for(int j = i ; j<nums.length ; j++){
              

                min = Math.min(nums[j] , min);


            }
            System.out.println(max);
            System.out.println(min);

            int stable = max - min;
           

            if(stable <= k){
                ans = Math.min(i , ans);

            }

            
        }

        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
}