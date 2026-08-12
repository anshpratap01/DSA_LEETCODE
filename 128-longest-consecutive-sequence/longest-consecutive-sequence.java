class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0;

        int longest = 1;
        int cnt = 0;
        int smaller = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]-1 == smaller){
                cnt = cnt+1;
                smaller = nums[i];

            }else if(smaller != nums[i]){
                
                smaller = nums[i];
               
                cnt = 1;

            }

             longest = Math.max(cnt , longest);


        }

        return longest;


        

    }
}