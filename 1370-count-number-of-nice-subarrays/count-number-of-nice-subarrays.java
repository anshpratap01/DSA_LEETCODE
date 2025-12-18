class Solution {
    public int numberOfSubarrays(int nums[], int k){
        return atmost(nums,k) - atmost(nums,k-1);
    }
    public int atmost(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int cnt = 0;
        int ans = 0;

        while(j<nums.length){
            if(nums[j]%2 != 0){
                cnt++;
            }

            if(cnt>k){
                while(cnt>k){
               if(nums[i] %2 != 0){
                cnt--;
               } 
               i++;
               

             }
             

            }
         ans = ans + (j-i+1);
            j++;
        }
        return ans;

    }
}