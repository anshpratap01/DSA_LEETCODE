class Solution {
    public int removeDuplicates(int[] nums) {

        int dif = 1;

        for(int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[dif] = nums[i];
                dif++;
            }

        }
        return dif;

        
    }
}