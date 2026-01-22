class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for(int ele : nums){
            xor = xor^ele;
        }

        int ans = xor^k;
        int a =  Integer.bitCount(ans);
        return a;
        
    }
}