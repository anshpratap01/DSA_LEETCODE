class Solution {
    public int cnt(int num){
        int count = 0;
        
        String nums = String.valueOf(num);
        int n = nums.length();
        for(int i = 1;i<n-1;i++){
            char curr = nums.charAt(i);
            char prev = nums.charAt(i-1);
            char next = nums.charAt(i+1);

           if((curr > prev && curr > next) || (curr < prev && curr < next)){
             count++;
             }

        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int result = 0;
        for(int i = num1; i<=num2; i++){
           result = result + cnt(i);
        } 
        return result;       
    }

}