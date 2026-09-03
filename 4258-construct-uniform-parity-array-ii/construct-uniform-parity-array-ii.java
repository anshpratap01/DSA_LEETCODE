class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean even = false;
        boolean odd = false;

        int min = Integer.MAX_VALUE;

        for(int i  = 0; i<nums1.length; i++){

            min = Math.min(nums1[i], min);
            if(nums1[i] %2 == 0){
                even = true;
            }else{
                odd = true;

            }
        }

        if(even == false || odd == false){
            return true;
        }
        if(min % 2 == 1){
            return true;
        }
        return false;

        
    }
}