class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
    int n = nums.size();
     int arr[] = new int[n];
     int idx = 0;
     Arrays.fill(arr,-1);
     for(int i = 0; i<n; i++){

        for(int  j = 0;j<nums.get(i); j++){
            if((j | j+1) == nums.get(i)){
                arr[i] = j;
                idx++;
                break;
            }
          
        }
        
     }
     return arr;
        
    }
}