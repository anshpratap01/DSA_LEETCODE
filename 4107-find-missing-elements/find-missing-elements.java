class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>  ans = new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();
        Arrays.sort(nums);
        int min = nums[0];
        int max  = nums[nums.length-1];
        
        for(int i = 0; i<nums.length; i++){
            st.add(nums[i]);
        }
        for(int i = min; i<=max; i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
         
        

        
    }
}