class NumArray {

    int arr[];
    public NumArray(int[] nums) {
        arr = new int[nums.length+1];
        for(int i = 0; i<nums.length; i++){
            arr[i+1] = nums[i] + arr[i];
        }
        
    }
    
    public int sumRange(int left, int right) {
        int ans = arr[right+1] - arr[left];
        return ans;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */