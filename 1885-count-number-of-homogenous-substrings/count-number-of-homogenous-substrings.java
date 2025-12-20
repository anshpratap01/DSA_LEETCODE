class Solution {
    public int countHomogenous(String s) {
        int cnt = 0;
        int sum = 0;
        int MOD = (1000000007);;

        for(int i = 0;i<s.length(); i++){
            if(i>0 && s.charAt(i) == s.charAt(i-1)){
                cnt++;
            }else{
                cnt = 1;
            }
            sum = (sum+cnt)%MOD;
        }
        return (int)sum;
        
    }
}