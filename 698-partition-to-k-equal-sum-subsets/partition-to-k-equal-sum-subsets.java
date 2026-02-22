class Solution {

    public boolean backtrack(int[] nums, boolean[] used,int start, int k,  int currSum, int target) {

        
        if (k == 1) return true;

        
        if (currSum == target) {
            return backtrack(nums, used, 0, k - 1, 0, target);
        }

        for (int i = start; i < nums.length; i++) {

            if (used[i] || currSum + nums[i] > target)
                continue;

            used[i] = true;

            if (backtrack(nums, used, i + 1, k,
                    currSum + nums[i], target))
                return true;

            used[i] = false;
        }

        return false;
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % k != 0) return false;

        boolean[] used = new boolean[nums.length];

        return backtrack(nums, used, 0, k, 0, sum / k);
    }
}