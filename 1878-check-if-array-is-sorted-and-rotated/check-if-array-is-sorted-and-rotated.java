class Solution {
    public boolean check(int[] arr) {
        int cnt = 0;
        int n = arr.length;
        for(int i = 1; i<n; i++){
            if(arr[i-1] > arr[i]){
                cnt++;
            }
             
        }
        if(arr[arr.length-1] > arr[0] ) cnt++;

        return cnt<=1;
    }
}