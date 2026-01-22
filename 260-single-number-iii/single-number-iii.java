class Solution {
    public int[] singleNumber(int[] arr) {
    int xor = 0;
      for(int ele : arr){
          xor = xor^ele;
      }
      
      int mask = (xor&(xor-1))^xor;
        int b1 = 0;
        int b2 = 0;
        for(int ele : arr){
            if((ele & (mask)) !=0) b1 = b1^ele;
            else b2= b2^ele;
        }
        int ans[] = {b1,b2};
        Arrays.sort(ans);
        return ans;
        
    }
}