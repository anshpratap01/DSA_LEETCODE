class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            boolean found = false;

            if (nums.get(i) == 2) {
                arr[i] = -1;
                continue;
            }

            for (int j = 1; j < 32; j++) {
                // if bit is already set, skip
                if ((nums.get(i) & (1 << (j))) > 0) {
                    continue;
                }

                int x = nums.get(i) ^ (1 << (j - 1));
                arr[i] = x;
                found = true;
                break;
            }

            if (!found) {
                arr[i] = -1;
            }
        }
        return arr;
    }
}
