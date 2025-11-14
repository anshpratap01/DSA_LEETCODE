class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int lo = 0;
        int high = n*m-1;
        while(lo<=high){
            int mid = lo+(high-lo)/2;
            int midrow = mid/m;
            int midcol  = mid%m;

            if(arr[midrow][midcol] == target){
                 return true;
            }else if(arr[midrow][midcol]> target){
                high = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return false;

        
    }
}