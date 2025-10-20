import java.util.*;

class Solution {
    public static void helper(int nums[], List<Integer> ans, int idx, List<List<Integer>> a){

        if (idx == nums.length) {
            a.add(new ArrayList<>(ans)); 
            return;
        }

       
        ans.add(nums[idx]);
        helper(nums, ans, idx + 1, a);

        
        ans.remove(ans.size() - 1);

       
        helper(nums, ans, idx + 1, a);
    }
    
    
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> a = new ArrayList<>();
       
       int idx = 0;
       helper(nums, new ArrayList<>(), idx, a);
       
       return a;
        
    }
}