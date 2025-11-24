class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int res = 0;

        for(int e : nums){
            res = ((res*2)+e)%5;
            ans.add(res==0);
        }
        return ans;        
    }
}