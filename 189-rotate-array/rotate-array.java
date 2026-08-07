class Solution {
    public void reverse(int arr[] , int start , int end){

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        k = k%n;
        reverse(nums , start , end);
        reverse(nums , start , k-1);
        reverse(nums , k , end);


        
    }
}