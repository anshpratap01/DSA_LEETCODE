class Solution {
    public int numSub(String s) {
        long  cnt = 0;
        long  result = 0;
        int mod = 1000000007;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                cnt++;
            }
            else{
                result = (result+ (cnt *(cnt +1))/2)%mod;
                cnt = 0;
            }
        }
        result = (result+ (cnt *(cnt +1))/2)%mod;
        return (int)result%mod;
        
    }
}