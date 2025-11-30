class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % p;
        }

        int miss = sum;
        if (miss == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int pre = 0;
        int min = nums.length;

        for(int i = 0; i < nums.length; i++) {
            pre = (pre + nums[i]) % p;
            int target = (pre - miss + p) % p;
            
            if (map.containsKey(target)) {
                int len = i - map.get(target);
                if (len < min) {
                    min = len;
                }
            }
            map.put(pre, i);
        }

        if (min == nums.length) {
            return -1;
        }
        
        return min;
        
    }
}