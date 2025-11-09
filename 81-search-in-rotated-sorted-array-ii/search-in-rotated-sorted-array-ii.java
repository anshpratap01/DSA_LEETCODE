class Solution {
    public boolean search(int[] arr, int tar) {
        int lo = 0;
        int high = arr.length-1;
        while(lo<=high){
            int mid = lo+(high - lo)/2;

            if(arr[mid] == tar) return true;
             if (arr[lo] == arr[mid] && arr[mid] == arr[high]) {
                lo++;
                high--;
            }
            else if(arr[lo] <= arr[mid]){
                if(arr[lo] <= tar && tar < arr[mid])  high = mid -1;
                else lo = mid+1;
            }else{
                 if(arr[mid]< tar && tar <= arr[high])  lo = mid+1;
                 else high = mid-1;  

            }
        }
        return false;
        
        
    }
}