class Solution {
   public int gcd(int a , int b){
    if(a == 0) return b;
    return gcd(b%a,a);
   }
    public int minOperations(int[] nums) {
        int one = 0;
        for(int num : nums){
        if(num == 1) one++;
    }
   int n = nums.length;
   if(one>0){
    return n - one;
   }
   int count = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            int curr = nums[i];
            for(int j = i+1; j<nums.length;j++){
            curr =  gcd(curr,nums[j]);
                if(curr == 1){
                    count = Math.min(count, j-i + n-1);
                    break;
                }
            }
        }
        
        if(count == Integer.MAX_VALUE ){
            return -1;
        } else{
            return count;
        }


        
    }
}