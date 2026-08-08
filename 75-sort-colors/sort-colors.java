class Solution {
    public void sortColors(int[] arr) {

        int lo = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                mid++;
                lo++;
            }
            else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        
    }
}