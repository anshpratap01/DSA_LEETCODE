class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        int idx = 0;

        List<Integer> ans = new ArrayList<>();

        
        int[] freq = new int[101];

        while (j < nums.length) {

            
            ans.add(nums[j]);
            freq[nums[j] + 50]++;

            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {

                
                int count = 0;
                int beauty = 0;

                for (int v = 0; v < 50; v++) {   
                    count += freq[v];
                    if (count >= x) {
                        beauty = v - 50;
                        break;
                    }
                }

                arr[idx++] = beauty;

               
                ans.remove(Integer.valueOf(nums[i]));
                freq[nums[i] + 50]--;

                i++;
                j++;
            }
        }
        return arr;
    }
}
