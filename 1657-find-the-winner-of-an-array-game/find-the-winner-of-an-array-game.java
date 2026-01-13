class Solution {
    public int getWinner(int[] arr, int k) {
        int win = arr[0];
        int count = 0;
        

        for(int i  = 1; i<arr.length; i++){
            if(win>arr[i]){
                count++;
            }else{
                win = arr[i];
                count = 1;
            }
            if(count == k){
                return win;
            }
        }
        return win;
        
    }
}