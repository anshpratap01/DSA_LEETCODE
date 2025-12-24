class Solution {
    public int minimumBoxes(int[] apple, int[] arr) {
        int sum = 0;
        for(int i = 0;i<apple.length; i++){
            sum = sum+apple[i];
        }
        Arrays.sort(arr);
        int idx = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length / 2; i++) {
         int temp = arr[i];
         arr[i] = arr[arr.length - 1 - i];
         arr[arr.length - 1 - i] = temp;
}

        while(sum > 0 ){
            sum = sum-arr[idx];
            cnt++;
            idx++;

        }
        return cnt;

    }
}