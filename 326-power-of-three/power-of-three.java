class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        for(int i = 0; Math.pow(3,i)<=n;i++){
            
            if(n==Math.pow(3,i)){
                return true;
            }
        }
        return false;
        
    }
}