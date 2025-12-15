class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int cnt = 0;

        while(j < arr.length){
            sum = sum+arr[j];

            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                int ans = sum+0;
                ans = ans/k;
                if(ans >= threshold){
                    cnt++;
                }
                sum = sum-arr[i];
                 
                 j++;
                 i++;
            }
           

        }
        return cnt;
        
    }
}