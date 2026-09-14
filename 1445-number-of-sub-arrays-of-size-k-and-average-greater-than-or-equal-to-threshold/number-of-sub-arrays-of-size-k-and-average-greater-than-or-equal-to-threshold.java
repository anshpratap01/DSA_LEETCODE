class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        //double avg = 0;
        int cnt = 0;
        int sum = 0;

        for(int right = 0; right < arr.length ; right++){
            sum = sum+ arr[right];
             
             if(right-left +1 == k){
                int len = right-left+1;
                double avg = sum/len;

                if(avg >= threshold){
                    cnt++;
                }

                sum = sum - arr[left];
                left++;
             }
            
            
        }
        return cnt;
        
    }
}