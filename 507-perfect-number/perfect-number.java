class Solution {
    public boolean checkPerfectNumber(int n) {
       // boolean flag = false;
        int sum = 0;
        for(int i = 1; i<=n/2; i++){
            if(n%i == 0){
               // flag = true;
                sum = sum+i;

            }
             
        }
        return (sum == n);

        
    }
}