class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            st.add(nums[i]);
        }
        for(int i = 1; i<=n; i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
        
    }
}