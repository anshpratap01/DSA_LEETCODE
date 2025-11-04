import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // Frequency map for current window
        Map<Integer, Integer> freq = new HashMap<>();

        // Initialize first window
        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        ans[0] = computeXSum(freq, x);

        // Slide the window
        for (int i = k; i < n; i++) {
            int out = nums[i - k]; // element leaving
            int in = nums[i];      // element entering

            // Update frequency
            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0) freq.remove(out);
            freq.put(in, freq.getOrDefault(in, 0) + 1);

            // Compute x-sum
            ans[i - k + 1] = computeXSum(freq, x);
        }

        return ans;
    }

    private int computeXSum(Map<Integer, Integer> freq, int x) {
        // Create list of [value, frequency]
        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            list.add(new int[]{e.getKey(), e.getValue()});
        }

        // Sort by frequency descending, then value descending
        list.sort((a, b) -> {
            if (b[1] == a[1]) return b[0] - a[0];
            return b[1] - a[1];
        });

        // Take top x elements
        int sum = 0;
        for (int i = 0; i < Math.min(x, list.size()); i++) {
            sum += list.get(i)[0] * list.get(i)[1];
        }
        return sum;
    }
}
