class Solution {
    public static void helper(int nums[], List<Integer> ans, int idx, Set<List<Integer>> set) {
        if (idx == nums.length) {
            set.add(new ArrayList<>(ans));
            return;
        }

        
        ans.add(nums[idx]);
        helper(nums, ans, idx + 1, set);

        
        ans.remove(ans.size() - 1);

        
        helper(nums, ans, idx + 1, set);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Set<List<Integer>> set = new LinkedHashSet<>(); 
        Arrays.sort(nums); 
        helper(nums, new ArrayList<>(), 0, set);
        return new ArrayList<>(set);
        
    }
}