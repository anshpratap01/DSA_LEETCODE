class Solution {
    public int  helper(int nums[], int target, int low, int high){
        if(low >  high) return -1;
        int mid = low+(high- low)/2;
        

        if(nums[mid] == target) return mid;
        else if (nums[mid] > target) return helper(nums,target,low,mid-1);
        else return helper(nums,target,mid+1,high);

    }
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        return helper(nums,target,low,high);
        
    }
}