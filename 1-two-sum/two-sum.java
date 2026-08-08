class Solution {
    public int[] twoSum(int[] nums, int target) {

        int arr[] = new int[2];

        for(int  i = 0; i<nums.length-1; i++){
            //int sum = nums[i];
            for(int j = i+1; j<nums.length; j++){
                int sum = nums[i]+nums[j];
                //System.out.println(nums[i]);
                //System.out.println(nums[j]);

                //System.out.print(sum);
                if(sum == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }else{
                    sum =  0;
                }

            }
        }
        return arr;
        
    }
}