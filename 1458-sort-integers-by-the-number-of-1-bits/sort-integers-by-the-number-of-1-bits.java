class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                int curr = Integer.bitCount(arr[j]);
                int next = Integer.bitCount(arr[j+1]);
                if(curr > next ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
                }
                 if(curr == next && arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]  = temp;

                 }
            }
        }
        return arr;
        
    }
}