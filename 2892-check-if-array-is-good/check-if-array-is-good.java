class Solution {
    public boolean isGood(int[] nums) {
        int[]freq=new int[201];
        for(int val:nums)freq[val]++;
        if(freq[nums.length-1]!=2)return false;
        for(int i=1;i<nums.length-1;i++){
            if(freq[i]!=1)return false;
        }
        return true;
    }
}