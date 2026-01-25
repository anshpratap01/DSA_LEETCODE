class Solution {
    public int minimumDifference(int[] nums, int k) {
            Arrays.sort(nums);
         int i = 0;
         int j = 0;
         int n = nums.length;
         int min = Integer.MAX_VALUE;
          
         while(j<nums.length){
            
            if(j-i+1 < k){
                j++;
            }
            //System.out.println("Index " + j);

              if( j-i+1 == k){
                int a = nums[i];
                int b = nums[j];
                int  diff = b-a;
                min = Math.min(diff,min);
                //System.out.println("minIndex " + j);
                //System.out.println ("min-->" +min+ " ");
                j++;
                i++;
                
 
            }

            
         }
         return min;
        
    }
}