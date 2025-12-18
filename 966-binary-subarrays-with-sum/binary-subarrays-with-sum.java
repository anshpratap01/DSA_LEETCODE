class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    public int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        int i = 0;
        int sum = 0;
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            while (sum > k) {
                sum -= nums[i];
                i++;
            }

            count += (j - i + 1);
        }

        return count;
    }
}
