class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int idx = 0;

        boolean flag1 = false;
        for(int i = 1; i<n; i++){
            if(nums[i]>nums[i-1]){
              flag1 = true;
              idx++;
             } 
           else{
            break;
        }
        }
        if(flag1 == false) return false;

        boolean flag2 = false;
        for(int i = idx+1;i<n; i++){
            if(nums[i] <nums[i-1]){
                flag2 = true;
                idx++;
            }else{
                break;
            }
        }
        if(flag2 == false) return false;
        if(idx > n) return false;

        boolean flag3 = false;
        
        for(int i = idx+1; i<n; i++){
            if(nums[i]>nums[i-1]){
                flag3 = true;
                idx++;
            }else{
                flag3 = false;
                break;
                
            }
        }
        System.out.print(idx+" ");

        if(flag3 == false) return false;
        if(flag1 == true && flag2 == true && flag3 == true) return true;

        return false;

        
        
    }
}