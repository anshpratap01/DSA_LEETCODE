class Solution {
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();

        int i = 0;
        int ans = 0;

        for (int j = 0; j < nums.length; j++) {

            
            while (!max.isEmpty() && max.peekLast() < nums[j]) {
                max.pollLast();
            }
            max.addLast(nums[j]);

            
            while (!min.isEmpty() && min.peekLast() > nums[j]) {
                min.pollLast();
            }
            min.addLast(nums[j]);

            
            while (max.peekFirst() - min.peekFirst() > limit) {

                if (max.peekFirst() == nums[i]) {
                    max.pollFirst();
                }

                if (min.peekFirst() == nums[i]) {
                    min.pollFirst();
                }

                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}
