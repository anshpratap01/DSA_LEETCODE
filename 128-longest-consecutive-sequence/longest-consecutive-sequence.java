class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet <Integer> set = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){
            set.add(nums[i]);
        }

      int max = 0;   

        for(int num : set){

            if(!set.contains(num-1)){

                int curr = num;
                int  cnt = 1;

                while(set.contains(curr+1)){
                    curr++;
                    cnt++;
                    
                // max = Math.max(cnt , max);

                }
                  max = Math.max(cnt , max);
            }
        }

        return max;
        
    }
}