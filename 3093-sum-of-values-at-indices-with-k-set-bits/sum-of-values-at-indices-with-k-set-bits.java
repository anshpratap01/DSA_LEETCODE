class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i<nums.size(); i++){
            int cnt = Integer.bitCount(i);
            if(cnt == k){
                sum = sum+nums.get(i);
            }
        }
        return sum;
        
    }
}